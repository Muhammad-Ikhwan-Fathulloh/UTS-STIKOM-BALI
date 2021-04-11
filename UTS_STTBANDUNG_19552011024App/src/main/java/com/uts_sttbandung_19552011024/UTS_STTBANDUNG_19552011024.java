package com.uts_sttbandung_19552011024;

import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.visual.Swatch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class UTS_STTBANDUNG_19552011024 extends MobileApplication {

    @Override
    public void init() {
        addViewFactory(HOME_VIEW, BasicView::new);//Memanggil activity
    }

    @Override
    public void postInit(Scene scene) {
        Swatch.BLUE.assignTo(scene);

        ((Stage) scene.getWindow()).getIcons().add(new Image(UTS_STTBANDUNG_19552011024.class.getResourceAsStream("/icon.png")));//License
    }
}
