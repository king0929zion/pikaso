package H;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Collection f1306f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, Collection collection) {
        super(1);
        this.f1305e = i3;
        this.f1306f = collection;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f1305e) {
            case 0:
                return Boolean.valueOf(this.f1306f.contains(obj));
            case 1:
                return Boolean.valueOf(this.f1306f.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.f1306f));
        }
    }
}
