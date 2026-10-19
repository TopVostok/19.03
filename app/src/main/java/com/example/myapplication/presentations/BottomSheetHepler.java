package com.example.myapplication.presentations;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.myapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class BottomSheetHelper { // Исправлена опечатка в названии класса

    public BottomSheetDialog dialog;

    public BottomSheetHelper(Context context) {
        dialog = new BottomSheetDialog(context);

        // Загружаем разметку, которую мы создали в Шаге 1
        View view = LayoutInflater.from(context).inflate(R.layout.bs_select_image, null);

        // Находим обычные кнопки
        Button bthGallery = view.findViewById(R.id.bthGallery);
        Button bthCamera = view.findViewById(R.id.bthCamera);

        // Обработчик для галереи
        bthGallery.setOnClickListener(v -> {
            // Вместо вызова несуществующего фрагмента показываем сообщение
            Toast.makeText(context, "Выбрать из галереи", Toast.LENGTH_SHORT).show();
            dialog.dismiss(); // Закрываем шторку после нажатия
        });

        // Обработчик для камеры
        bthCamera.setOnClickListener(v -> {
            Toast.makeText(context, "Сфотографировать", Toast.LENGTH_SHORT).show();
            dialog.dismiss(); // Закрываем шторку после нажатия
        });

        // Устанавливаем разметку в диалоговое окно
        dialog.setContentView(view);
    }
}