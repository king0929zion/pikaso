package c0;

import d2.C0248s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3733a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3734b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3735c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3736d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3737e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3738f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3739g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final List f3740i;

    /* renamed from: j, reason: collision with root package name */
    public final List f3741j;

    public C0153d(String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, List list, int i3) {
        str = (i3 & 1) != 0 ? "" : str;
        f3 = (i3 & 2) != 0 ? 0.0f : f3;
        f4 = (i3 & 4) != 0 ? 0.0f : f4;
        f5 = (i3 & 8) != 0 ? 0.0f : f5;
        f6 = (i3 & 16) != 0 ? 1.0f : f6;
        f7 = (i3 & 32) != 0 ? 1.0f : f7;
        f8 = (i3 & 64) != 0 ? 0.0f : f8;
        f9 = (i3 & 128) != 0 ? 0.0f : f9;
        if ((i3 & 256) != 0) {
            int i4 = AbstractC0146F.f3689a;
            list = C0248s.f4255d;
        }
        ArrayList arrayList = new ArrayList();
        this.f3733a = str;
        this.f3734b = f3;
        this.f3735c = f4;
        this.f3736d = f5;
        this.f3737e = f6;
        this.f3738f = f7;
        this.f3739g = f8;
        this.h = f9;
        this.f3740i = list;
        this.f3741j = arrayList;
    }
}
