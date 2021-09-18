import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { suryaSharedModule } from '../../shared';
import { suryaAdminModule } from '../../admin/admin.module';

import {
    PostService,
    PostPopupService,
    PostComponent,
    PostDetailComponent,
    PostDialogComponent,
    PostPopupComponent,
    PostDeletePopupComponent,
    PostDeleteDialogComponent,
    postRoute,
    postPopupRoute,
} from './';

let ENTITY_STATES = [
    ...postRoute,
    ...postPopupRoute,
];

@NgModule({
    imports: [
        suryaSharedModule,
        suryaAdminModule,
        RouterModule.forRoot(ENTITY_STATES, { useHash: true })
    ],
    declarations: [
        PostComponent,
        PostDetailComponent,
        PostDialogComponent,
        PostDeleteDialogComponent,
        PostPopupComponent,
        PostDeletePopupComponent,
    ],
    entryComponents: [
        PostComponent,
        PostDialogComponent,
        PostPopupComponent,
        PostDeleteDialogComponent,
        PostDeletePopupComponent,
    ],
    providers: [
        PostService,
        PostPopupService,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class suryaPostModule {}
