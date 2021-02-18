package com.company.police.web.screens.policestation;

import com.haulmont.cuba.gui.screen.*;
import com.company.police.entity.PoliceStation;

@UiController("police_PoliceStation.edit")
@UiDescriptor("police-station-edit.xml")
@EditedEntityContainer("policeStationDc")
@LoadDataBeforeShow
public class PoliceStationEdit extends StandardEditor<PoliceStation> {
}