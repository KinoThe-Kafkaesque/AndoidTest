package two.one.showcase;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import two.one.showcase.beans.Produit;
import two.one.showcase.service.ProduitService;


public class DetailsPizza extends AppCompatActivity {
    private ProduitService ps = new ProduitService();
    private ImageView image;
    private TextView desc;
    private TextView nom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_pizza);
        Intent intent = getIntent();
        int id = Integer.parseInt(intent.getStringExtra("idf"));
        //  ps = ProduitService.getInstance();
        image = findViewById(R.id.photo);
        nom = findViewById(R.id.nom);


        Produit f = ps.findById(id).orElse(null);
        image.setImageResource(f.getPhoto());
        desc = findViewById(R.id.desc);
        desc.setText(f.getDescription());
        nom.setText(f.getName());

    }
}