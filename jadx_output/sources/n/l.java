package N;

import d2.AbstractC0239j;
import d2.AbstractC0242m;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements Iterable, q2.a {
    public static final l h = new l(0, 0, 0, null);

    /* renamed from: d, reason: collision with root package name */
    public final long f1746d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1747e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1748f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1749g;

    public l(long j3, long j4, int i3, int[] iArr) {
        this.f1746d = j3;
        this.f1747e = j4;
        this.f1748f = i3;
        this.f1749g = iArr;
    }

    public final l a(l lVar) {
        l lVar2;
        int[] iArr;
        l lVar3 = h;
        if (lVar == lVar3) {
            return this;
        }
        if (this == lVar3) {
            return lVar3;
        }
        int i3 = lVar.f1748f;
        int[] iArr2 = lVar.f1749g;
        long j3 = lVar.f1747e;
        long j4 = lVar.f1746d;
        int i4 = this.f1748f;
        if (i3 == i4 && iArr2 == (iArr = this.f1749g)) {
            return new l(this.f1746d & (~j4), this.f1747e & (~j3), i4, iArr);
        }
        if (iArr2 != null) {
            lVar2 = this;
            for (int i5 : iArr2) {
                lVar2 = lVar2.b(i5);
            }
        } else {
            lVar2 = this;
        }
        int i6 = lVar.f1748f;
        if (j3 != 0) {
            for (int i7 = 0; i7 < 64; i7++) {
                if (((1 << i7) & j3) != 0) {
                    lVar2 = lVar2.b(i7 + i6);
                }
            }
        }
        if (j4 != 0) {
            for (int i8 = 0; i8 < 64; i8++) {
                if (((1 << i8) & j4) != 0) {
                    lVar2 = lVar2.b(i8 + 64 + i6);
                }
            }
        }
        return lVar2;
    }

    public final l b(int i3) {
        int[] iArr;
        int b3;
        int i4 = this.f1748f;
        int i5 = i3 - i4;
        if (i5 >= 0 && i5 < 64) {
            long j3 = 1 << i5;
            long j4 = this.f1747e;
            if ((j4 & j3) != 0) {
                return new l(this.f1746d, j4 & (~j3), i4, this.f1749g);
            }
        } else if (i5 >= 64 && i5 < 128) {
            long j5 = 1 << (i5 - 64);
            long j6 = this.f1746d;
            if ((j6 & j5) != 0) {
                return new l(j6 & (~j5), this.f1747e, i4, this.f1749g);
            }
        } else if (i5 < 0 && (iArr = this.f1749g) != null && (b3 = t.b(iArr, i3)) >= 0) {
            int length = iArr.length;
            int i6 = length - 1;
            if (i6 == 0) {
                return new l(this.f1746d, this.f1747e, this.f1748f, null);
            }
            int[] iArr2 = new int[i6];
            if (b3 > 0) {
                AbstractC0239j.X(0, 0, b3, iArr, iArr2);
            }
            if (b3 < i6) {
                AbstractC0239j.X(b3, b3 + 1, length, iArr, iArr2);
            }
            return new l(this.f1746d, this.f1747e, this.f1748f, iArr2);
        }
        return this;
    }

    public final boolean c(int i3) {
        int[] iArr;
        int i4 = i3 - this.f1748f;
        if (i4 >= 0 && i4 < 64) {
            return ((1 << i4) & this.f1747e) != 0;
        }
        if (i4 >= 64 && i4 < 128) {
            return ((1 << (i4 - 64)) & this.f1746d) != 0;
        }
        if (i4 <= 0 && (iArr = this.f1749g) != null) {
            return t.b(iArr, i3) >= 0;
        }
        return false;
    }

    public final l d(l lVar) {
        l lVar2;
        int[] iArr;
        l lVar3 = lVar;
        l lVar4 = h;
        if (lVar3 == lVar4) {
            return this;
        }
        if (this == lVar4) {
            return lVar3;
        }
        int i3 = lVar3.f1748f;
        long j3 = this.f1747e;
        long j4 = this.f1746d;
        int[] iArr2 = lVar3.f1749g;
        long j5 = lVar3.f1747e;
        long j6 = lVar3.f1746d;
        int i4 = this.f1748f;
        if (i3 == i4 && iArr2 == (iArr = this.f1749g)) {
            return new l(j4 | j6, j3 | j5, i4, iArr);
        }
        int[] iArr3 = this.f1749g;
        if (iArr3 == null) {
            if (iArr3 != null) {
                for (int i5 : iArr3) {
                    lVar3 = lVar3.e(i5);
                }
            }
            int i6 = this.f1748f;
            if (j3 != 0) {
                for (int i7 = 0; i7 < 64; i7++) {
                    if (((1 << i7) & j3) != 0) {
                        lVar3 = lVar3.e(i7 + i6);
                    }
                }
            }
            if (j4 == 0) {
                return lVar3;
            }
            for (int i8 = 0; i8 < 64; i8++) {
                if (((1 << i8) & j4) != 0) {
                    lVar3 = lVar3.e(i8 + 64 + i6);
                }
            }
            return lVar3;
        }
        if (iArr2 != null) {
            lVar2 = this;
            for (int i9 : iArr2) {
                lVar2 = lVar2.e(i9);
            }
        } else {
            lVar2 = this;
        }
        int i10 = lVar3.f1748f;
        if (j5 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j5) != 0) {
                    lVar2 = lVar2.e(i11 + i10);
                }
            }
        }
        if (j6 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j6) != 0) {
                    lVar2 = lVar2.e(i12 + 64 + i10);
                }
            }
        }
        return lVar2;
    }

    public final l e(int i3) {
        int i4;
        int i5 = this.f1748f;
        int i6 = i3 - i5;
        long j3 = this.f1747e;
        if (i6 < 0 || i6 >= 64) {
            long j4 = this.f1746d;
            if (i6 < 64 || i6 >= 128) {
                int[] iArr = this.f1749g;
                if (i6 < 128) {
                    if (iArr == null) {
                        return new l(j4, j3, i5, new int[]{i3});
                    }
                    int b3 = t.b(iArr, i3);
                    if (b3 < 0) {
                        int i7 = -(b3 + 1);
                        int length = iArr.length;
                        int[] iArr2 = new int[length + 1];
                        AbstractC0239j.X(0, 0, i7, iArr, iArr2);
                        AbstractC0239j.X(i7 + 1, i7, length, iArr, iArr2);
                        iArr2[i7] = i3;
                        return new l(this.f1746d, this.f1747e, this.f1748f, iArr2);
                    }
                } else if (!c(i3)) {
                    int i8 = ((i3 + 1) / 64) * 64;
                    int i9 = this.f1748f;
                    ArrayList arrayList = null;
                    long j5 = j4;
                    while (true) {
                        if (i9 >= i8) {
                            i4 = i9;
                            break;
                        }
                        if (j3 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArr != null) {
                                    for (int i10 : iArr) {
                                        arrayList.add(Integer.valueOf(i10));
                                    }
                                }
                            }
                            for (int i11 = 0; i11 < 64; i11++) {
                                if (((1 << i11) & j3) != 0) {
                                    arrayList.add(Integer.valueOf(i11 + i9));
                                }
                            }
                        }
                        if (j5 == 0) {
                            i4 = i8;
                            j3 = 0;
                            break;
                        }
                        i9 += 64;
                        j3 = j5;
                        j5 = 0;
                    }
                    if (arrayList != null) {
                        iArr = new int[arrayList.size()];
                        Iterator it = arrayList.iterator();
                        int i12 = 0;
                        while (it.hasNext()) {
                            iArr[i12] = ((Number) it.next()).intValue();
                            i12++;
                        }
                    }
                    return new l(j5, j3, i4, iArr).e(i3);
                }
            } else {
                long j6 = 1 << (i6 - 64);
                if ((j4 & j6) == 0) {
                    return new l(j4 | j6, j3, i5, this.f1749g);
                }
            }
        } else {
            long j7 = 1 << i6;
            if ((j3 & j7) == 0) {
                return new l(this.f1746d, j3 | j7, i5, this.f1749g);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Z0.d.D(new k(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC0242m.W(this));
        Iterator it = iterator();
        while (true) {
            w2.g gVar = (w2.g) it;
            if (!gVar.hasNext()) {
                break;
            }
            arrayList.add(String.valueOf(((Number) gVar.next()).intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = arrayList.get(i4);
            i3++;
            if (i3 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
