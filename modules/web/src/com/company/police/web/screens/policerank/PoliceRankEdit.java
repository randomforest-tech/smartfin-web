package com.company.police.web.screens.policerank;

import com.haulmont.cuba.gui.screen.*;
import com.company.police.entity.PoliceRank;

@UiController("police_PoliceRank.edit")
@UiDescriptor("police-rank-edit.xml")
@EditedEntityContainer("policeRankDc")
@LoadDataBeforeShow
public class PoliceRankEdit extends StandardEditor<PoliceRank> {
}