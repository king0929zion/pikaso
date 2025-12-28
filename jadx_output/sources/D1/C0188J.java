package d1;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.ai.assistance.operit.provider.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: d1.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188J {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f4146d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f4147a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f4148b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f4149c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f4147a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a3 = a(viewGroup.getChildAt(childCount));
                    if (a3 != null) {
                        return a3;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }
}
