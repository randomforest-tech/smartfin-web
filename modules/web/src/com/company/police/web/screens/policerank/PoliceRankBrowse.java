package com.company.police.web.screens.policerank;

import com.haulmont.cuba.gui.screen.*;
import com.company.police.entity.PoliceRank;

@UiController("police_PoliceRank.browse")
@UiDescriptor("police-rank-browse.xml")
@LookupComponent("policeRanksTable")
@LoadDataBeforeShow
public class PoliceRankBrowse extends StandardLookup<PoliceRank> {
}