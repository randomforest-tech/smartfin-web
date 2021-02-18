package com.company.police.web.screens.fines;

import com.haulmont.cuba.gui.screen.*;
import com.company.police.entity.Fines;

@UiController("police_Fines.browse")
@UiDescriptor("fines-browse.xml")
@LookupComponent("finesesTable")
@LoadDataBeforeShow
public class FinesBrowse extends StandardLookup<Fines> {
}