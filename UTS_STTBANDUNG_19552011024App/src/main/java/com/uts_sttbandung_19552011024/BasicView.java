package com.uts_sttbandung_19552011024;

import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.control.Icon;
import com.gluonhq.charm.glisten.control.BottomNavigation;
import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import com.gluonhq.charm.glisten.control.NavigationDrawer;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.*;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

public class BasicView extends View {
    
    public BasicView() {
        home();//Memanggil method home
        bottom();//Memanggil method bottom
    }
    
    public void home(){
        Label form = new Label("Zodiak View");//Memanggil label
        form.setFont(new Font(17));//Ukuran font 17
        
        //Zodiak View
        Image aries_lg = new Image("/aries_lg.9.png", 100, 100, false, false);//Mengatur ukuran dan memanggil gambar
        ImageView aries = new ImageView();
        aries.setImage(aries_lg);
        Label aries_ex = new Label("Aries\n" + "21 Maret - 20 April", aries);//Menampilkan gambar dan text
        
        //Klik label untuk pindah tampilan
        aries_ex.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                Label form = new Label("Detail View");
                form.setFont(new Font(17));//Ukuran font 17
                
                Text aries_text = new Text();//Membuat variabel text baru
                aries_text.setFont(new Font(12));//Ukuran font 12
                aries_text.setWrappingWidth(300);//Jarak lebar pinggir tampilan
                aries_text.setTextAlignment(TextAlignment.JUSTIFY);//Rata tulisan
                aries_text.setText("Agar perjalanan kariermu semakin bagus, kamu perlu meningkatkan wawasan dan keahlian. Jangan lupakan dua hal tersebut. Keuangan: dana investasi dan jaminan hari tua tidak boleh diganggu gugat. Asmara: api asmaramu sedang membara. Bagi kamu yang saat ini melajang, kamu akan segera menemui belahan jiwa.");
                
                //Memanggil variabel secara Vertikal
                VBox controls = new VBox(15.0, form, aries, aries_text);
                
                //Memanggil variabel menjadi rata tengah
                controls.setAlignment(Pos.CENTER);

                //Memanggil variabel ke tengah
                setCenter(controls);
                
                kembali();//Memanggil method kembali
            }
        });
        
        //Zodiak View
        Image taurus_lg = new Image("/taurus_lg.9.png", 100, 100, false, false);//Mengatur ukuran dan memanggil gambar
        ImageView taurus = new ImageView();
        taurus.setImage(taurus_lg);
        Label taurus_ex = new Label("Taurus\n" + "21 April - 21 Mei", taurus);//Menampilkan gambar dan text
        
        //Klik label untuk pindah tampilan
        taurus_ex.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                Label form = new Label("Detail View");
                form.setFont(new Font(17));//Ukuran font 17
                
                Text taurus_text = new Text();
                taurus_text.setFont(new Font(12));//Ukuran font 12
                taurus_text.setWrappingWidth(300);//Jarak lebar pinggir tampilan
                taurus_text.setTextAlignment(TextAlignment.JUSTIFY);//Rata tulisan
                taurus_text.setText("Ada baiknya kamu mulai membuka diri dengan cara berpikir orang lain agar masalahmu yang berkaitan dengan hubungan sosial bisa segera teratasi. Keuangan: hatihati dengan krisis keuangan di pertengahan bulan. Asmara: kisah cinta yang sempat layu tampaknya akan mekar kembali.");
                
                //Memanggil variabel secara Vertikal
                VBox controls = new VBox(15.0, form, taurus, taurus_text);
                
                //Memanggil variabel menjadi rata tengah
                controls.setAlignment(Pos.CENTER);

                //Memanggil variabel ke tengah
                setCenter(controls);
                
                kembali();//Memanggil method kembali
            }
        });
        
        //Zodiak View
        Image gemini_lg = new Image("/gemini_lg.9.png", 100, 100, false, false);//Mengatur ukuran dan memanggil gambar
        ImageView gemini = new ImageView();
        gemini.setImage(gemini_lg);
        Label gemini_ex = new Label("Gemini\n" + "22 Mei - 21 Juni", gemini);//Menampilkan gambar dan text
        
        //Klik label untuk pindah tampilan
        gemini_ex.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                Label form = new Label("Detail View");
                form.setFont(new Font(17));//Ukuran font 17
                
                Text gemini_text = new Text();
                gemini_text.setFont(new Font(12));//Ukuran font 12
                gemini_text.setWrappingWidth(300);//Jarak lebar pinggir tampilan
                gemini_text.setTextAlignment(TextAlignment.JUSTIFY);//Rata tulisan
                gemini_text.setText("Apapun yang terjadi hari ini, kamu harus tetap bersikap hati-hati. Jangan menyerah dengan hal-hal yang selama ini kamu perjuangkan. Keuangan: tidak perlu iri dengan kondisi keuangan orang lain. Asmara: kamu akan menjadi sosok yang lebih bijaksana karena beberapa masalah cinta di masa lalu.");
                
                //Memanggil variabel secara Vertikal
                VBox controls = new VBox(15.0, form, gemini, gemini_text);
                
                //Memanggil variabel menjadi rata tengah
                controls.setAlignment(Pos.CENTER);

                //Memanggil variabel ke tengah
                setCenter(controls);
                
                kembali();//Memanggil method kembali
            }
        });
        
        //Zodiak View
        Image cancer_lg = new Image("/cancer_lg.9.png", 100, 100, false, false);//Mengatur ukuran dan memanggil gambar
        ImageView cancer = new ImageView();
        cancer.setImage(cancer_lg);
        Label cancer_ex = new Label("Cancer\n" + "22 Juni - 21 Juli", cancer);//Menampilkan gambar dan text
        
        //Klik label untuk pindah tampilan
        cancer_ex.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                Label form = new Label("Detail View");
                form.setFont(new Font(17));//Ukuran font 17
                
                Text cancer_text = new Text();
                cancer_text.setFont(new Font(12));//Ukuran font 12
                cancer_text.setWrappingWidth(300);//Jarak lebar pinggir tampilan
                cancer_text.setTextAlignment(TextAlignment.JUSTIFY);//Rata tulisan
                cancer_text.setText("Hari ini kamu cenderung menghabiskan waktu di rumah bersama keluarga dan orangorang terdekat. Keuangan: masih cukup aman. Asmara: ada kenangan manis tentang seseorang yang muncul dalam benakmu. Nikmati saja kenangan itu sebagai sesuatu yang telah memberi kamu pelajaran berharga.");
                
                //Memanggil variabel secara Vertikal
                VBox controls = new VBox(15.0, form, cancer, cancer_text);
                
                //Memanggil variabel menjadi rata tengah
                controls.setAlignment(Pos.CENTER);

                //Memanggil variabel ke tengah
                setCenter(controls);
                
                kembali();//Memanggil method kembali
            }
        });
        
        //Zodiak View
        Image leo_lg = new Image("/leo_lg.9.png", 100, 100, false, false);//Mengatur ukuran dan memanggil gambar
        ImageView leo = new ImageView();
        leo.setImage(leo_lg);
        Label leo_ex = new Label("Leo\n" + "23 Juli - 22 Agustus", leo);//Menampilkan gambar dan text
        
        //Klik label untuk pindah tampilan
        leo_ex.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                Label form = new Label("Detail View");
                form.setFont(new Font(17));//Ukuran font 17
                
                Text leo_text = new Text();
                leo_text.setFont(new Font(12));//Ukuran font 12
                leo_text.setWrappingWidth(300);//Jarak lebar pinggir tampilan
                leo_text.setTextAlignment(TextAlignment.JUSTIFY);//Rata tulisan
                leo_text.setText("Ada hal yang akan membuat kamu merasa bingung. Hal itu berkaitan dengan niat, keinginan, dan impianmu selama ini. Keuangan: cenderung stabil meski pemasukan hari ini tidak cukup besar. Asmara: tidak perlu melakukan hal gila hanya karena cintamu ditolak.");
                
                //Memanggil variabel secara Vertikal
                VBox controls = new VBox(15.0, form, leo, leo_text);
                
                //Memanggil variabel menjadi rata tengah
                controls.setAlignment(Pos.CENTER);

                //Memanggil variabel ke tengah
                setCenter(controls);
                
                kembali();//Memanggil method kembali
            }
        });
        
        //Zodiak View
        Image virgo_lg = new Image("/virgo_lg.9.png", 100, 100, false, false);//Mengatur ukuran dan memanggil gambar
        ImageView virgo = new ImageView();
        virgo.setImage(virgo_lg);
        Label virgo_ex = new Label("Virgo\n" + "22 Agustus - 22 September", virgo);//Menampilkan gambar dan text
        
        //Klik label untuk pindah tampilan
        virgo_ex.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                Label form = new Label("Detail View");
                form.setFont(new Font(17));//Ukuran font 17
                
                Text virgo_text = new Text();
                virgo_text.setFont(new Font(12));//Ukuran font 12
                virgo_text.setWrappingWidth(300);//Jarak lebar pinggir tampilan
                virgo_text.setTextAlignment(TextAlignment.JUSTIFY);//Rata tulisan
                virgo_text.setText("Kamu akan diperhadapkan dengan situasi sulit. Meski demikian, tetaplah tenang dan jadi diri sendiri. Setiap hal selalu memiliki akhirnya. Keuangan: tidak ada salahnya jika ingin memiliki bisnis kecil-kecilan. Asmara: semakin cinta dan sayang dengan si dia.");
                //Memanggil variabel secara Vertikal
                VBox controls = new VBox(15.0, form, virgo, virgo_text);
                
                //Memanggil variabel menjadi rata tengah
                controls.setAlignment(Pos.CENTER);

                //Memanggil variabel ke tengah
                setCenter(controls);
                
                kembali();//Memanggil method kembali
            }
        });
        
        //Zodiak View
        Image libra_lg = new Image("/libra_lg.9.png", 100, 100, false, false);//Mengatur ukuran dan memanggil gambar
        ImageView libra = new ImageView();
        libra.setImage(libra_lg);
        Label libra_ex = new Label("Libra\n" + "23 September - 23 Oktober", libra);//Menampilkan gambar dan text
        
        //Klik label untuk pindah tampilan
        libra_ex.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                Label form = new Label("Detail View");
                form.setFont(new Font(17));//Ukuran font 17
                
                Text libra_text = new Text();
                libra_text.setFont(new Font(12));//Ukuran font 12
                libra_text.setWrappingWidth(300);//Jarak lebar pinggir tampilan
                libra_text.setTextAlignment(TextAlignment.JUSTIFY);//Rata tulisan
                libra_text.setText("Kamu memang bukan sosok yang suka dengan kepopuleran, tetapi sikap terbuka dan ramahmu telah menarik perhatian banyak orang. Senyum kamu memiliki efek besar untuk menyemangati orang lain. Keuangan: jangan gegabah meminjam uang ke bank. Asmara: muncul niat untuk melanjutkan hubungan ke arah yang lebih serius.");
            
                //Memanggil variabel secara Vertikal
                VBox controls = new VBox(15.0, form, libra, libra_text);
                
                //Memanggil variabel menjadi rata tengah
                controls.setAlignment(Pos.CENTER);

                //Memanggil variabel ke tengah
                setCenter(controls);
                
                kembali();//Memanggil method kembali
            }
        });
        
        //Zodiak View
        Image scorpio_lg = new Image("/scorpio_lg.9.png", 100, 100, false, false);//Mengatur ukuran dan memanggil gambar
        ImageView scorpio = new ImageView();
        scorpio.setImage(scorpio_lg);
        Label scorpio_ex = new Label("Scorpio\n" + "24 Oktober - 22 November", scorpio);//Menampilkan gambar dan text
        
        //Klik label untuk pindah tampilan
        scorpio_ex.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                Label form = new Label("Detail View");
                form.setFont(new Font(17));//Ukuran font 17
                
                Text scorpio_text = new Text();
                scorpio_text.setFont(new Font(12));//Ukuran font 12
                scorpio_text.setWrappingWidth(300);//Jarak lebar pinggir tampilan
                scorpio_text.setTextAlignment(TextAlignment.JUSTIFY);//Rata tulisan
                scorpio_text.setText("Cara berpikir yang baik akan menuntunmu ke titik-titik kehidupan yang lebih stabil. Jangan lelah untuk terus belajar. Keuangan: tidak perlu khawatirkan hari esok. Hari esok memiliki kesusahannya sendiri. Asmara: siap menyongsong cinta dan masa depan yang baru");
                        
                //Memanggil variabel secara Vertikal
                VBox controls = new VBox(15.0, form, scorpio, scorpio_text);
                
                //Memanggil variabel menjadi rata tengah
                controls.setAlignment(Pos.CENTER);

                //Memanggil variabel ke tengah
                setCenter(controls);
                
                kembali();//Memanggil method kembali
            }
        });
        
        //Zodiak View
        Image sagitarius_lg = new Image("/sagittarius_lg.9.png", 100, 100, false, false);//Mengatur ukuran dan memanggil gambar
        ImageView sagitarius = new ImageView();
        sagitarius.setImage(sagitarius_lg);
        Label sagitarius_ex = new Label("Sagitarius\n" + "23 November - 21 Desember", sagitarius);//Menampilkan gambar dan text
        
        //Klik label untuk pindah tampilan
        sagitarius_ex.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                Label form = new Label("Detail View");
                form.setFont(new Font(17));//Ukuran font 17
                
                Text sagitarius_text = new Text();
                sagitarius_text.setFont(new Font(12));//Ukuran font 12
                sagitarius_text.setWrappingWidth(300);//Jarak lebar pinggir tampilan
                sagitarius_text.setTextAlignment(TextAlignment.JUSTIFY);//Rata tulisan
                sagitarius_text.setText("Orang-orang yang tidak kamu duga akan memberi kejutan kepadamu. Awalnya merasa sangat kaget tapi kamu sangat menyukai hal itu. Keuangan: mulai berhemat jika tidak ingin merasakan kesusahan di akhir bulan nanti. Asmara: jika dia benar-benar jodoh kamu, dia tak akan ke mana-mana.");
                        
                //Memanggil variabel secara Vertikal
                VBox controls = new VBox(15.0, form, sagitarius, sagitarius_text);
                
                //Memanggil variabel menjadi rata tengah
                controls.setAlignment(Pos.CENTER);

                //Memanggil variabel ke tengah
                setCenter(controls);
                
                kembali();//Memanggil method kembali
            }
        });
        
        //Zodiak View
        Image capricorn_lg = new Image("/capricorn_lg.9.png", 100, 100, false, false);//Mengatur ukuran dan memanggil gambar
        ImageView capricorn = new ImageView();
        capricorn.setImage(capricorn_lg);
        Label capricorn_ex = new Label("Capricorn\n" + "22 Desember - 20 Januari", capricorn);//Menampilkan gambar dan text
        
        //Klik label untuk pindah tampilan
        capricorn_ex.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                Label form = new Label("Detail View");
                form.setFont(new Font(17));//Ukuran font 17
                
                Text capricorn_text = new Text();
                capricorn_text.setFont(new Font(12));//Ukuran font 12
                capricorn_text.setWrappingWidth(300);//Jarak lebar pinggir tampilan
                capricorn_text.setTextAlignment(TextAlignment.JUSTIFY);//Rata tulisan
                capricorn_text.setText("Perluas lingkungan pertemanan dan jaringan kerjamu. Sesuatu yang baik sudah menanti kamu di depan sana. Keuangan: mencoba berinvestasi kecil-kecilan. Asmara: perjalanan romansa kamu hari berjalan baik. Kamu harus mensyukuri hal itu.");
                        
                //Memanggil variabel secara Vertikal
                VBox controls = new VBox(15.0, form, capricorn, capricorn_text);
                
                //Memanggil variabel menjadi rata tengah
                controls.setAlignment(Pos.CENTER);

                //Memanggil variabel ke tengah
                setCenter(controls);
                
                kembali();//Memanggil method kembali
            }
        });
        
        //Zodiak View
        Image aquarius_lg = new Image("/aquarius_lg.9.png", 100, 100, false, false);//Mengatur ukuran dan memanggil gambar
        ImageView aquarius = new ImageView();
        aquarius.setImage(aquarius_lg);
        Label aquarius_ex = new Label("Aquarius\n" + "21 Januari - 19 Februari", aquarius);//Menampilkan gambar dan text
        
        //Klik label untuk pindah tampilan
        aquarius_ex.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                Label form = new Label("Detail View");
                form.setFont(new Font(17));//Ukuran font 17
                
                Text aquarius_text = new Text();
                aquarius_text.setFont(new Font(12));//Ukuran font 12
                aquarius_text.setWrappingWidth(300);//Jarak lebar pinggir tampilan
                aquarius_text.setTextAlignment(TextAlignment.JUSTIFY);//Rata tulisan
                aquarius_text.setText("Di tengah cuaca yang tidak menentu saat ini, kamu harus selalu menjaga kesehatan. Hal apapun bisa kamu kerjakan asal kamu sehat. Makan teratur dan istirahat dengan baik. Keuangan: harus banyak belajar mengelola keuangan secara rapi. Asmara: jangan larut dengan kenangan masa lalu.");
                        
                //Memanggil variabel secara Vertikal
                VBox controls = new VBox(15.0, form, aquarius, aquarius_text);
                
                //Memanggil variabel menjadi rata tengah
                controls.setAlignment(Pos.CENTER);

                //Memanggil variabel ke tengah
                setCenter(controls);
                
                kembali();//Memanggil method kembali
            }
        });
        
        //Zodiak View
        Image pisces_lg = new Image("/pisces_lg.9.png", 100, 100, false, false);//Mengatur ukuran dan memanggil gambar
        ImageView pisces = new ImageView();
        pisces.setImage(pisces_lg);
        Label pisces_ex = new Label("Pisces\n" + "20 Februari - 20 Maret", pisces);//Menampilkan gambar dan text
        
        //Klik label untuk pindah tampilan
        pisces_ex.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                Label form = new Label("Detail View");
                form.setFont(new Font(17));//Ukuran font 17
                
                Text pisces_text = new Text();
                pisces_text.setFont(new Font(12));//Ukuran font 12
                pisces_text.setWrappingWidth(300);//Jarak lebar pinggir tampilan
                pisces_text.setTextAlignment(TextAlignment.JUSTIFY);//Rata tulisan
                pisces_text.setText("Tidak ada masalah serius yang berkaitan dengan karier kamu hari ini. Itu semua berkat kerja kerasmu di waktu yang lalu. Keuangan: sisihkan sedikit uang untuk memberi sesuatu kepada orang-orang yang kamu cintai. Asmara: diam-diam dia merasa senang dengan kejutan yang kamu berikan.");
                        
                //Memanggil variabel secara Vertikal
                VBox controls = new VBox(15.0, form, pisces, pisces_text);
                
                //Memanggil variabel menjadi rata tengah
                controls.setAlignment(Pos.CENTER);

                //Memanggil variabel ke tengah
                setCenter(controls);
                
                kembali();//Memanggil method kembali    
            }
        });
        
        //List View
        ObservableList names = FXCollections.observableArrayList(
                aries_ex, taurus_ex, gemini_ex, cancer_ex, leo_ex, virgo_ex, libra_ex, scorpio_ex, sagitarius_ex, capricorn_ex, aquarius_ex, pisces_ex);//Zodiak View ke dalam list
        ListView listView = new ListView(names);//Memanggil Variabel
        listView.setMaxHeight(1000);//Maksimal tinggi list
        
        //Memanggil variabel secara Vertikal
        VBox controls = new VBox(15.0, form, listView);
        controls.setAlignment(Pos.CENTER);
        
        setCenter(controls);
        
        
    }
    
    public void about(){
        //About Me
        Label form = new Label("About Me");
        form.setFont(new Font(17));//Ukuran font 17
        
        //Foto View
        Image ikhwan = new Image("/ikhwan.png", 200, 200, false, false);//Mengatur ukuran dan memanggil gambar
        ImageView about = new ImageView();
        about.setImage(ikhwan);
        
        //Nama View
        Label nama = new Label("Muhammad Ikhwan Fathulloh");
        nama.setFont(new Font(17));//Ukuran font 17
        
        //NPM View
        Label npm = new Label("19552011024");
        npm.setFont(new Font(17));//Ukuran font 17
        
        //Memanggil variabel secara Vertikal
        VBox controls = new VBox(15.0, form, about, npm, nama);
        
        //Memanggil variabel menjadi rata tengah
        controls.setAlignment(Pos.CENTER);
        
        //Memanggil variabel ke tengah
        setCenter(controls);
           
    }
    
    public void bottom(){
        BottomNavigationButton home = new BottomNavigationButton();//Membuat variabel bottom baru
        home.setGraphic(new Icon(MaterialDesignIcon.HOME));//Menampilkan icon home
        home.setText("Home");
        
        //Klik button untuk pindah tampilan
        home.setOnAction(new EventHandler<ActionEvent>(){
          @Override
          public void handle(ActionEvent e){
              home();//Memanggil method home
              
          }
        });
        
        BottomNavigationButton about = new BottomNavigationButton();
        about.setGraphic(new Icon(MaterialDesignIcon.PERSON));//Menampilkan icon person
        about.setText("About");
        
        //Klik button untuk pindah tampilan
        about.setOnAction(new EventHandler<ActionEvent>(){
          @Override
          public void handle(ActionEvent e){
              about();//Memanggil method about              
          }
        });
        
        BottomNavigation bn = new BottomNavigation();//Membuat variabel BottomNavigation baru
        bn.getActionItems().addAll(home, about);//Memanggil variabel home dan about sebagai item
        
        NavigationDrawer nd = new NavigationDrawer();//Membuat variabel NavigationDrawer baru
        nd.getItems().addAll(bn);//Memanggil variabel BottomNavigation sebagai item
        
        //Memanggil variabel secara Horizontal
        HBox controls = new HBox(nd);
        
        //Memanggil variabel menjadi rata tengah
        controls.setAlignment(Pos.BASELINE_CENTER);
        
        //Memanggil variabel ke bawah
        setBottom(controls);
        
    }
    
    public void kembali(){
        Button kembali = new Button("Kembali");
        kembali.setGraphic(new Icon(MaterialDesignIcon.BACKSPACE));
        
        //Klik button untuk pindah tampilan
        kembali.setOnAction(new EventHandler<ActionEvent>(){
          @Override
          public void handle(ActionEvent e){
              home();//Memanggil method home
              bottom();//Memanggil method bottom
              
          }
        });
        
        //Memanggil variabel secara Horizontal
        HBox controls = new HBox(kembali);
        
        //Memanggil variabel menjadi rata tengah
        controls.setAlignment(Pos.BASELINE_CENTER);
        
        //Memanggil variabel ke bawah
        setBottom(controls);
    }

    @Override
    public void updateAppBar(AppBar appBar) {
        //Membuat tampilan navbar
        appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> System.out.println("Menu")));
        appBar.setTitleText("UTS STIKOM BALI");
        appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> System.out.println("Search")));
    } 
}
