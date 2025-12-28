package b;

import a.AbstractC0090a;
import android.os.Bundle;
import com.ai.assistance.operit.provider.MainComposeActivity;
import d2.AbstractC0241l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements A1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3583b;

    public /* synthetic */ d(int i3, Object obj) {
        this.f3582a = i3;
        this.f3583b = obj;
    }

    @Override // A1.d
    public final Bundle a() {
        switch (this.f3582a) {
            case 0:
                MainComposeActivity mainComposeActivity = (MainComposeActivity) this.f3583b;
                Bundle bundle = new Bundle();
                f fVar = mainComposeActivity.f3606m;
                fVar.getClass();
                HashMap hashMap = fVar.f3586b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(fVar.f3587c));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) fVar.f3590f.clone());
                return bundle;
            default:
                M.c cVar = (M.c) this.f3583b;
                LinkedHashMap linkedHashMap = cVar.f1517a;
                p2.g.e(linkedHashMap, "<this>");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                for (Map.Entry entry : cVar.f1518b.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list.size() == 1) {
                        Object c3 = ((o2.a) list.get(0)).c();
                        if (c3 == null) {
                            continue;
                        } else {
                            if (!cVar.a(c3)) {
                                throw new IllegalStateException(AbstractC0090a.C(c3).toString());
                            }
                            linkedHashMap2.put(str, AbstractC0241l.S(c3));
                        }
                    } else {
                        int size = list.size();
                        ArrayList arrayList = new ArrayList(size);
                        for (int i3 = 0; i3 < size; i3++) {
                            Object c4 = ((o2.a) list.get(i3)).c();
                            if (c4 != null && !cVar.a(c4)) {
                                throw new IllegalStateException(AbstractC0090a.C(c4).toString());
                            }
                            arrayList.add(c4);
                        }
                        linkedHashMap2.put(str, arrayList);
                    }
                }
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    List list2 = (List) entry2.getValue();
                    bundle2.putParcelableArrayList(str2, list2 instanceof ArrayList ? (ArrayList) list2 : new ArrayList<>(list2));
                }
                return bundle2;
        }
    }
}
