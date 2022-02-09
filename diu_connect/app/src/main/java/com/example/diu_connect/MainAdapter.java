package com.example.diu_connect;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainAdapter extends FirebaseRecyclerAdapter<MainModel, MainAdapter.myviewholder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     * @param applicationContext
     */
    Context context;

    public MainAdapter(@NonNull FirebaseRecyclerOptions<MainModel> options,Context context) {
        super(options);
        this.context=context;

    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, @SuppressLint("RecyclerView") int position, @NonNull MainModel model) {
    holder.name.setText(model.getName());
    holder.role.setText(model.getRole());
//    holder.email.setText(model.getEmail());
//    holder.phone.setText(model.getPhone());
//    holder.room.setText(model.getHouse());



        Glide.with(holder.img.getContext())
                .load(model.getTurl())
                .placeholder(R.drawable.common_google_signin_btn_icon_dark)
                .circleCrop()
                .error(R.drawable.common_google_signin_btn_icon_dark_normal)
                .into(holder.img);

        holder.bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                Toast.makeText(context,"hello"+model.getRoom(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context,Detail.class);
                intent.putExtra("img",model.getTurl());
                intent.putExtra("name",model.getName());
                intent.putExtra("email",model.getEmail());
                intent.putExtra("phone",model.getPhone());
                intent.putExtra("room",model.getRoom());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });







    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item,parent,false);
        return new myviewholder(view);
    }

    static class myviewholder extends RecyclerView.ViewHolder{
        CircleImageView img;
        TextView name,role;
        Button bt;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img1);
            name=itemView.findViewById(R.id.nametext);
            role=itemView.findViewById(R.id.roletext);
            bt=itemView.findViewById(R.id.button);
//



            



        }


    }
}
