package androidx.core.graphics.drawable;

import W0.c;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f3394k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f3396b;

    /* renamed from: j, reason: collision with root package name */
    public String f3403j;

    /* renamed from: a, reason: collision with root package name */
    public int f3395a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f3397c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f3398d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f3399e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f3400f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3401g = null;
    public PorterDuff.Mode h = f3394k;

    /* renamed from: i, reason: collision with root package name */
    public String f3402i = null;

    public final String toString() {
        String str;
        int i3;
        if (this.f3395a == -1) {
            return String.valueOf(this.f3396b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f3395a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f3395a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3396b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f3396b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f3403j);
                sb.append(" id=");
                int i4 = this.f3395a;
                if (i4 == -1) {
                    int i5 = Build.VERSION.SDK_INT;
                    Object obj = this.f3396b;
                    if (i5 >= 28) {
                        i3 = c.a(obj);
                    } else {
                        i3 = 0;
                        try {
                            i3 = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                        } catch (NoSuchMethodException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                        } catch (InvocationTargetException e5) {
                            Log.e("IconCompat", "Unable to get icon resource", e5);
                        }
                    }
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i3 = this.f3399e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i3)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f3399e);
                if (this.f3400f != 0) {
                    sb.append(" off=");
                    sb.append(this.f3400f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3396b);
                break;
        }
        if (this.f3401g != null) {
            sb.append(" tint=");
            sb.append(this.f3401g);
        }
        if (this.h != f3394k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}
