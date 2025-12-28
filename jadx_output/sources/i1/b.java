package I1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import n.C0379F;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0379F f1394a = new C0379F(0);

    /* renamed from: b, reason: collision with root package name */
    public final C0379F f1395b = new C0379F(0);

    public static b a(Context context, int i3) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i3);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e3) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i3), e3);
            return null;
        }
    }

    public static b b(ArrayList arrayList) {
        b bVar = new b();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Animator animator = (Animator) arrayList.get(i3);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            bVar.f1395b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = a.f1391b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = a.f1392c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = a.f1393d;
            }
            c cVar = new c();
            cVar.f1399d = 0;
            cVar.f1400e = 1;
            cVar.f1396a = startDelay;
            cVar.f1397b = duration;
            cVar.f1398c = interpolator;
            cVar.f1399d = objectAnimator.getRepeatCount();
            cVar.f1400e = objectAnimator.getRepeatMode();
            bVar.f1394a.put(propertyName, cVar);
        }
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f1394a.equals(((b) obj).f1394a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1394a.hashCode();
    }

    public final String toString() {
        return "\n" + b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f1394a + "}\n";
    }
}
