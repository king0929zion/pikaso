package J1;

import D1.w;
import O0.l;
import O0.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p.InterfaceC0531J;
import p.n;
import p.r;
import p.v;

/* loaded from: classes.dex */
public final class b implements InterfaceC0531J {

    /* renamed from: a, reason: collision with root package name */
    public int f1431a;

    /* renamed from: b, reason: collision with root package name */
    public int f1432b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1433c;

    public b(View view) {
        this.f1433c = view;
    }

    @Override // p.InterfaceC0531J
    public long c(n nVar, n nVar2, n nVar3) {
        return (this.f1432b + this.f1431a) * 1000000;
    }

    @Override // p.InterfaceC0531J
    public n e(long j3, n nVar, n nVar2, n nVar3) {
        return ((w) this.f1433c).e(j3, nVar, nVar2, nVar3);
    }

    @Override // p.InterfaceC0531J
    public n f(long j3, n nVar, n nVar2, n nVar3) {
        return ((w) this.f1433c).f(j3, nVar, nVar2, nVar3);
    }

    public b(Context context, XmlResourceParser xmlResourceParser) {
        this.f1433c = new ArrayList();
        this.f1432b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.f2056g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 0) {
                this.f1431a = obtainStyledAttributes.getResourceId(index, this.f1431a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f1432b);
                this.f1432b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new l().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public b(int i3, int i4, r rVar) {
        this.f1431a = i3;
        this.f1432b = i4;
        this.f1433c = new w(new v(i3, i4, rVar));
    }
}
