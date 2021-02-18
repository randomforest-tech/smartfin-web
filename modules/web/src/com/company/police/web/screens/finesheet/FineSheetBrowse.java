package com.company.police.web.screens.finesheet;

import com.haulmont.cuba.gui.screen.*;
import com.company.police.entity.FineSheet;

@UiController("police_FineSheet.browse")
@UiDescriptor("fine-sheet-browse.xml")
@LookupComponent("fineSheetsTable")
@LoadDataBeforeShow
public class FineSheetBrowse extends StandardLookup<FineSheet> {
}