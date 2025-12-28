package s1;

import A.AbstractC0000a;
import android.content.DialogInterface;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: s1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0590d extends AbstractComponentCallbacksC0591e implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final DialogInterfaceOnDismissListenerC0588b h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6127i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6128j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6129k;

    public DialogInterfaceOnCancelListenerC0590d() {
        new M1.h(7, this);
        new DialogInterfaceOnCancelListenerC0587a(this);
        this.h = new DialogInterfaceOnDismissListenerC0588b(this);
        this.f6127i = -1;
        new C0589c(0, this);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        if (this.f6128j) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f6129k) {
            return;
        }
        this.f6129k = true;
        this.f6128j = true;
        if (this.f6127i >= 0) {
            B2.i d3 = d();
            int i3 = this.f6127i;
            if (i3 < 0) {
                throw new IllegalArgumentException(AbstractC0000a.c("Bad id: ", i3));
            }
            d3.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        M1.i iVar = new M1.i(d());
        C0594h c0594h = new C0594h(3, this);
        ((ArrayList) iVar.f1693d).add(c0594h);
        c0594h.f6138c = 0;
        c0594h.f6139d = 0;
        c0594h.f6140e = 0;
        c0594h.f6141f = 0;
        if (iVar.f1692c) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + iVar);
            PrintWriter printWriter = new PrintWriter(new C0595i());
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(iVar.f1691b);
            printWriter.print(" mCommitted=");
            printWriter.println(iVar.f1692c);
            ArrayList arrayList = (ArrayList) iVar.f1693d;
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    C0594h c0594h2 = (C0594h) arrayList.get(i4);
                    switch (c0594h2.f6136a) {
                        case 0:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case 3:
                            str = "REMOVE";
                            break;
                        case 4:
                            str = "HIDE";
                            break;
                        case 5:
                            str = "SHOW";
                            break;
                        case 6:
                            str = "DETACH";
                            break;
                        case 7:
                            str = "ATTACH";
                            break;
                        case 8:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + c0594h2.f6136a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(c0594h2.f6137b);
                    if (c0594h2.f6138c != 0 || c0594h2.f6139d != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0594h2.f6138c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0594h2.f6139d));
                    }
                    if (c0594h2.f6140e != 0 || c0594h2.f6141f != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0594h2.f6140e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0594h2.f6141f));
                    }
                }
            }
            printWriter.close();
        }
        iVar.f1692c = true;
        B2.i iVar2 = (B2.i) iVar.f1694e;
        iVar.f1691b = -1;
        synchronized (((ArrayList) iVar2.f316e)) {
        }
    }
}
