package com.company.police.web.screens.finetypes;

import com.haulmont.cuba.gui.screen.*;
import com.company.police.entity.FineTypes;

@UiController("police_FineTypes.browse")
@UiDescriptor("fine-types-browse.xml")
@LookupComponent("fineTypesesTable")
@LoadDataBeforeShow
public class FineTypesBrowse extends StandardLookup<FineTypes> {
}