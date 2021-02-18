package com.company.police.web.screens.policestation;

import com.haulmont.cuba.gui.screen.*;
import com.company.police.entity.PoliceStation;

@UiController("police_PoliceStation.browse")
@UiDescriptor("police-station-browse.xml")
@LookupComponent("policeStationsTable")
@LoadDataBeforeShow
public class PoliceStationBrowse extends StandardLookup<PoliceStation> {
}