package O1;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f2062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f2064c;

    public b(int i3) {
        this.f2062a = i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(CarouselLayoutManager carouselLayoutManager, int i3) {
        this(1);
        this.f2063b = i3;
        switch (i3) {
            case 1:
                this.f2064c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f2064c = carouselLayoutManager;
                break;
        }
    }
}
