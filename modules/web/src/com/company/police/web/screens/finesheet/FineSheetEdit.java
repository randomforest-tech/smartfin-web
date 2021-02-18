package com.company.police.web.screens.finesheet;

import com.haulmont.cuba.gui.screen.*;
import com.company.police.entity.FineSheet;

@UiController("police_FineSheet.edit")
@UiDescriptor("fine-sheet-edit.xml")
@EditedEntityContainer("fineSheetDc")
@LoadDataBeforeShow
public class FineSheetEdit extends StandardEditor<FineSheet> {
}