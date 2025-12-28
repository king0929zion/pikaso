package D1;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import d1.AbstractC0189K;
import java.lang.reflect.Field;

/* renamed from: D1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069c extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f964a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0069c(Class cls, String str, int i3) {
        super(cls, str);
        this.f964a = i3;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f964a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(x.f1035a.M((View) obj));
            default:
                Field field = AbstractC0189K.f4150a;
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f964a) {
            case 0:
                f fVar = (f) obj;
                PointF pointF = (PointF) obj2;
                fVar.getClass();
                fVar.f967a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                fVar.f968b = round;
                int i3 = fVar.f972f + 1;
                fVar.f972f = i3;
                if (i3 == fVar.f973g) {
                    x.a(fVar.f971e, fVar.f967a, round, fVar.f969c, fVar.f970d);
                    fVar.f972f = 0;
                    fVar.f973g = 0;
                    break;
                }
                break;
            case 1:
                f fVar2 = (f) obj;
                PointF pointF2 = (PointF) obj2;
                fVar2.getClass();
                fVar2.f969c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                fVar2.f970d = round2;
                int i4 = fVar2.f973g + 1;
                fVar2.f973g = i4;
                if (fVar2.f972f == i4) {
                    x.a(fVar2.f971e, fVar2.f967a, fVar2.f968b, fVar2.f969c, round2);
                    fVar2.f972f = 0;
                    fVar2.f973g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                x.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                x.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                x.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                x.f1035a.e0((View) obj, floatValue);
                break;
            default:
                Field field = AbstractC0189K.f4150a;
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
