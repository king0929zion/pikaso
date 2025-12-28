package com.ai.assistance.operit.provider;

import A1.g;
import G1.c;
import L.a;
import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.E;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import b.k;
import c.AbstractC0140a;
import o0.C0477e0;
import w2.h;

/* loaded from: classes.dex */
public final class MainComposeActivity extends k {
    @Override // b.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVar = c.f1271b;
        ViewGroup.LayoutParams layoutParams = AbstractC0140a.f3663a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C0477e0 c0477e0 = childAt instanceof C0477e0 ? (C0477e0) childAt : null;
        if (c0477e0 != null) {
            c0477e0.setParentCompositionContext(null);
            c0477e0.setContent(aVar);
            return;
        }
        C0477e0 c0477e02 = new C0477e0(this);
        c0477e02.setParentCompositionContext(null);
        c0477e02.setContent(aVar);
        View decorView = getWindow().getDecorView();
        if (E.b(decorView) == null) {
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        }
        if (((J) h.X(h.Z(h.Y(decorView, K.h), K.f3460i))) == null) {
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (((g) h.X(h.Z(h.Y(decorView, A1.h.f218f), A1.h.f219g))) == null) {
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(c0477e02, AbstractC0140a.f3663a);
    }
}
