package com.example.bandungcreative.Activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bandungcreative.Adapter.BestDealAdapter;
import com.example.bandungcreative.Adapter.CategoryAdapter;
import com.example.bandungcreative.Domain.CategoryDomain;
import com.example.bandungcreative.Domain.ItemsDomain;
import com.example.bandungcreative.R;

import java.util.ArrayList;

//Nama        : Syayful Hidayat ;
//NIM         : 10120912 ;
//Kelas       : IF9K ;
//Mata Kuliah : Pemrograman Android ;
//Dosen       : Rizki Adam Kurniawan S.Kom., M.Kom. ;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter catAdapter,bestDealAdapter;
private RecyclerView recyclerViewcat,recyclerViewBestDeal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        initRecyeclerviewcat();
        initLocation();
        initRecyclerViewBestDeal();
    }

    private void initLocation(){
        String[] items = new String[]{"Bandung Creative Hub", "Padepokan Seni Mayang Sunda", "Teras Sunda Cibiru", "Kampung Wisata Pasir Kunci"};
        final Spinner locationspin = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        locationspin.setAdapter(adapter);

    }

    private void initRecyeclerviewcat() {
        ArrayList<CategoryDomain> items = new ArrayList<>();
        items.add(new CategoryDomain("meeting","Meeting"));
        items.add(new CategoryDomain("music","Music"));
        items.add(new CategoryDomain("dance","Dance"));
        items.add(new CategoryDomain("park","Park"));
        items.add(new CategoryDomain("art","Art"));

        recyclerViewcat = findViewById(R.id.catView);
        recyclerViewcat.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        catAdapter = new CategoryAdapter(items);
        recyclerViewcat.setAdapter(catAdapter);
    }
    private void initRecyclerViewBestDeal(){
        recyclerViewBestDeal = findViewById(R.id.bestView);
        recyclerViewBestDeal.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        bestDealAdapter = new BestDealAdapter(getData());
        recyclerViewBestDeal.setAdapter(bestDealAdapter);
    }
    public ArrayList<ItemsDomain> getData(){
        ArrayList<ItemsDomain>items = new ArrayList<>();
        items.add(new ItemsDomain("areaamphithear","Area Amphithear",6.5,"Area ini merupakan pintu utama Bandung Creative Hub. Amphitheater dirancang sebagai public space dengan sirkulasi optimal. Berbagai aktivitas seperti coworker, mini showcase, serta diskusi kelompok bisa digelar di area dengan interior kayu dan tangga berwarna ini\n" +
                "Fasilitas: Kursi (40), Meja, Stopkontak (36)",4));
        items.add(new ItemsDomain("areaparkir","Area Parkir",7.1,"Area ini terletak di dasar Bandung Creative Hub yang berfungsi sebagai parkiran sepeda motor. Meski demikian, area yang dipenuhi mural ini tidak menutup kemungkinan jika dimanfaatkan sebagai alternatif *venue mini showcase, movieclips, serta pameran seni rupa.",5));
        items.add(new ItemsDomain("areapameran","Area Exibition", 5.2,"Ruang khusus pameran di Bandung Creative Hub ini berada di lantai 1 gedung. Beragam jenis pameran mulai dari seni rupa, seni kriya, fotografi, DKV, dan pameran lainnya bisa digelar di ruang dengan tampilan visual menjorok ke Jalan Laswi Bandung. Cocok untuk: Pameran Seni Rupa, Seni Kriya, Fotografi, dan DKV Fasilitas: - Display Foto (10) - Meja Display (4) - Rak Display (1) - Box Display (3) - Pedestal (5) ",3));
        items.add(new ItemsDomain("areataman","Area Taman",3.500,"Ruang khusus pameran di Bandung Creative Hub ini berada di lantai 1 gedung. Beragam jenis pameran mulai dari seni rupa, seni kriya, fotografi, DKV, dan pameran lainnya bisa digelar di ruang dengan tampilan visual menjorok ke Jalan Laswi Bandung. Cocok untuk: Pameran Seni Rupa, Seni Kriya, Fotografi, dan DKV Fasilitas: - Display Foto (10) - Meja Display (4) - Rak Display (1) - Box Display (3) - Pedestal (5) ",2));
        items.add(new ItemsDomain("studiomusik","Studio Musik",2.7,"Studio musik yang terletak di lantai dasar ini, merupakan studio musik gratis pertama di Bandung. Fasilitas yang tersedia sesuai standar studio musik pada umumnya dengan gitar listrik, gitar akustik, bass listrik, keyboard, drum, dan perangkat amplifier. Cocok untuk: Latihan Musik, Instrumental, Duo, dan Band Fasilitas: - Microphone Lewitt - Electric Guitar Yamaha - Electric Guitar Squier - Electric Bass Squier - Acoustic Electric Guitar Takamine ED3NC - Drum Set Gretsch - Digital Piano Yamaha - Analog Mixer Yamaha MG16XU - Amplifier Blackstar ID40 - Amplifier Rolland JC - Amplifier Bass Fender Rumble - Speaker JBL EON615 Prosedur",3));
        items.add(new ItemsDomain("studiojahit","Studio Jahit",8.5,"Studio Jahit terletak di dekat taman lantai 4. Studio ini berfungsi sebagai sarana penciptaan olahan kriya dan fesyen jahit. Fasilitas yang tersedia di studio ini berupa mesin jahit, mesin obras, mesin bordir, serta seperangkat benang jahit. Cocok untuk: Membuat Olahan Kriya dan Fesyen Jahit Fasilitas: - Mesin Jahit JUKI HZL-27z (5) - Mesin Obras JUKI MO-50e (2) - Mesin Bordir Surya S-1201PT (1) - Kursi (7)",5));
        items.add(new ItemsDomain("studiodigital","Studio Digital",7.1,"Studio yang terletak di pojok lantai 3 ini berfungsi sebagai ruang produksi konten digital. Fasilitas yang tersedia di sini berupa perangkat lampu dan white space yang bisa dieksplorasi oleh para kreator konten digital dengan berbagai garapan. Cocok untuk: Digital Content, Campaign Video, dan Fashion Lookbook Video Fasilitas",5));
        items.add(new ItemsDomain("studiotari","Studio Tari",7.1,"Studio yang terletak di sebelah Auditorium ini merupakan studio latihan tari tradisional, modern, dan kontemporer. Studio Tari telah dilengkapi dengan kaca dinding, lantai vinyl, dan speaker untuk mendukung proses latihan koreografi semakin optimal. Cocok untuk: Latihan Tari Tradisional, Modern, Kontemporer, dan Koreografi Fasilitas: - Speaker RCF (1) - Dinding Kaca - Lantai Vinyl Prosedur",4.2));
        items.add(new ItemsDomain("studiofashion","Studio Fashion",7.1,"Studio yang terletak di lantai 5 ini merupakan ruang khusus aktivitas fesyen. Berbagai aktivitas berkaitan fesyen seperti modeling class, makeup class, mini catwalk, serta workshop fashion bisa diselenggarakan di studio ini. Cocok untuk: Modeling Class, MakeUp Class, Mini Catwalk, dan Workshop Fasilitas: - Kursi - Meja Panjang (1) - Microphone - Speaker RCF (1) - Mixer Primatech Prosedur",4.8));
        items.add(new ItemsDomain("studioanimasiediting","Studio Animasi Editing",7.1,"Studio Animasi dan Editing berada di dekat taman lantai 4. Studio ini memiliki berfungsi untuk penciptaan animasi, desain grafis, serta editing video. Aktivitas di studio ini telah sepaket dengan perangkat Komputer, Wacom Pen Tablets, serta headset. Cocok untuk: Membuat Animasi, Desain Grafis, Rendering, dan Editing Video Fasilitas: - CPU HP Z440 (2) - CPU HP Z640 (6) - CPU Axioo (4) - Monitor HP Z27n (3) - Monitor HP N240 (5) - Monitor Axioo (4) - Headset Logitech (5) - Wacom Intuos Art (4) - Software Design/Editing: Adobe Family, Figma, Davinci Resolve, Sony Vegas - Software Animasi/3D/Rendering: Blender, Cinema 4D, Unreal Engine 5, Houdini, Marvelous Designer, Toon Boom Harmony, Zbrush. ",3.8));
        items.add(new ItemsDomain("studiorecording","Studio Recording",7.1,"Studio yang terletak di lantai 3 ini merupakan ruang produksi musik di Bandung Creative Hub. Beragam aktivitas rekaman musik baik project solo, duo, band, tapping voice over, dan rekaman berbasis suara bisa diselenggarakan di studio ini. Cocok untuk: Rekaman Musik dan Tapping Voice Over Fasilitas: - Drum Akustik Sakae - Electric Guitar Fender Stratocaster - Guitar Acoustic Cort MR E NS - Electric Bass Fender Jazz - Bass Acoustic - Amplifier Marshall JCM900 - Amplifier Behringer VT250X - Microphone Dynamic & Condenser - Preamp Neve 1073 DPA dan API 123 - Audio Interface Apogee Symphony MKII - Speaker Monitor Recording Adam S1X - Pro DI Passive Direct Box Radial - Software Cubase, Pro Tools, Logic Pro X, Studio One ",3.8));
        return items;
    }
}