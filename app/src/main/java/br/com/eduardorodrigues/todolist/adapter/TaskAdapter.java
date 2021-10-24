package br.com.eduardorodrigues.todolist.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import br.com.eduardorodrigues.todolist.model.Task;

public class TaskAdapter extends BaseAdapter {
    private Context context;
    private List<Task> tasks;

    public TaskAdapter(Context context, List<Task> tasks){
        this.context = context;
        this.tasks = tasks;
    }

    @Override
    public int getCount() {
        return tasks.size();
    }

    @Override
    public Object getItem(int position) {
        return tasks.get(position);
    }

    @Override
    public long getItemId(int position) {
        return tasks.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
