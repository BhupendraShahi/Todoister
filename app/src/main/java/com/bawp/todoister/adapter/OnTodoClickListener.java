package com.bawp.todoister.adapter;

import com.bawp.todoister.model.Task;

public interface OnTodoClickListener {
    void onTodoCLick(Task task);
    void onTodoRadioButtonClick(Task task);
}
