package x1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: x1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660l {

    /* renamed from: a, reason: collision with root package name */
    public final int f6713a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6714b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6715c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6716d;

    public C0660l(int i3, int i4, long j3, long j4) {
        this.f6713a = i3;
        this.f6714b = i4;
        this.f6715c = j3;
        this.f6716d = j4;
    }

    public static C0660l a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0660l c0660l = new C0660l(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0660l;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f6713a);
            dataOutputStream.writeInt(this.f6714b);
            dataOutputStream.writeLong(this.f6715c);
            dataOutputStream.writeLong(this.f6716d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0660l)) {
            return false;
        }
        C0660l c0660l = (C0660l) obj;
        return this.f6714b == c0660l.f6714b && this.f6715c == c0660l.f6715c && this.f6713a == c0660l.f6713a && this.f6716d == c0660l.f6716d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6714b), Long.valueOf(this.f6715c), Integer.valueOf(this.f6713a), Long.valueOf(this.f6716d));
    }
}
