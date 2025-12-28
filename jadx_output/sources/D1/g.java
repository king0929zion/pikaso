package D1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g extends o {

    /* renamed from: A, reason: collision with root package name */
    public static final C0069c f974A;

    /* renamed from: B, reason: collision with root package name */
    public static final C0069c f975B;

    /* renamed from: C, reason: collision with root package name */
    public static final C0069c f976C;

    /* renamed from: D, reason: collision with root package name */
    public static final C0069c f977D;

    /* renamed from: E, reason: collision with root package name */
    public static final C0069c f978E;

    /* renamed from: z, reason: collision with root package name */
    public static final String[] f979z = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    static {
        new C0068b(PointF.class, "boundsOrigin").f963a = new Rect();
        f974A = new C0069c(PointF.class, "topLeft", 0);
        f975B = new C0069c(PointF.class, "bottomRight", 1);
        f976C = new C0069c(PointF.class, "bottomRight", 2);
        f977D = new C0069c(PointF.class, "topLeft", 3);
        f978E = new C0069c(PointF.class, "position", 4);
    }

    public static void F(v vVar) {
        View view = vVar.f1029b;
        Field field = AbstractC0189K.f4150a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = vVar.f1028a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", vVar.f1029b.getParent());
    }

    @Override // D1.o
    public final void c(v vVar) {
        F(vVar);
    }

    @Override // D1.o
    public final void f(v vVar) {
        F(vVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // D1.o
    public final Animator j(ViewGroup viewGroup, v vVar, v vVar2) {
        int i3;
        g gVar;
        ObjectAnimator ofObject;
        if (vVar == null || vVar2 == null) {
            return null;
        }
        HashMap hashMap = vVar.f1028a;
        HashMap hashMap2 = vVar2.f1028a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i4 = rect.left;
        int i5 = rect2.left;
        int i6 = rect.top;
        int i7 = rect2.top;
        int i8 = rect.right;
        int i9 = rect2.right;
        int i10 = rect.bottom;
        int i11 = rect2.bottom;
        int i12 = i8 - i4;
        int i13 = i10 - i6;
        int i14 = i9 - i5;
        int i15 = i11 - i7;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
            i3 = 0;
        } else {
            i3 = (i4 == i5 && i6 == i7) ? 0 : 1;
            if (i8 != i9 || i10 != i11) {
                i3++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i3++;
        }
        if (i3 <= 0) {
            return null;
        }
        View view = vVar2.f1029b;
        x.a(view, i4, i6, i8, i10);
        if (i3 != 2) {
            gVar = this;
            if (i4 == i5 && i6 == i7) {
                gVar.f1017v.getClass();
                ofObject = ObjectAnimator.ofObject(view, f976C, (TypeConverter) null, X1.e.f(i8, i10, i9, i11));
            } else {
                gVar.f1017v.getClass();
                ofObject = ObjectAnimator.ofObject(view, f977D, (TypeConverter) null, X1.e.f(i4, i6, i5, i7));
            }
        } else if (i12 == i14 && i13 == i15) {
            gVar = this;
            gVar.f1017v.getClass();
            ofObject = ObjectAnimator.ofObject(view, f978E, (TypeConverter) null, X1.e.f(i4, i6, i5, i7));
        } else {
            gVar = this;
            f fVar = new f();
            fVar.f971e = view;
            gVar.f1017v.getClass();
            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(fVar, f974A, (TypeConverter) null, X1.e.f(i4, i6, i5, i7));
            gVar.f1017v.getClass();
            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(fVar, f975B, (TypeConverter) null, X1.e.f(i8, i10, i9, i11));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject2, ofObject3);
            animatorSet.addListener(new C0070d(fVar));
            ofObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            r2.a.a0(viewGroup4, true);
            gVar.a(new e(viewGroup4));
        }
        return ofObject;
    }

    @Override // D1.o
    public final String[] o() {
        return f979z;
    }
}
