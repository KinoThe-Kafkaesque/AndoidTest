package two.one.showcase.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import two.one.showcase.R;
import two.one.showcase.beans.Produit;
import two.one.showcase.service.ProduitService;


    public class PizzaAdapter extends BaseAdapter {
        private List<Produit> pizzas;
        private LayoutInflater inflater;

        public PizzaAdapter(Activity activity, List<Produit> pizzas) {
            this.pizzas = pizzas;
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public int getCount() {
            return pizzas.size();
        }

        @Override
        public Object getItem(int position) {
            return pizzas.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position + 1;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView == null)
                convertView = inflater.inflate(R.layout.pizza_item, null);

            TextView idf = convertView.findViewById(R.id.idf);
            TextView nom = convertView.findViewById(R.id.nom);
            TextView quantite = convertView.findViewById(R.id.quantite);
            ImageView photo = convertView.findViewById(R.id.photo);

            idf.setText(pizzas.get(position).getId()+"");
            nom.setText(pizzas.get(position).getName());
            quantite.setText(pizzas.get(position).getDuree()+"");
            photo.setImageResource(pizzas.get(position).getPhoto());




            return convertView;
        }
    }

