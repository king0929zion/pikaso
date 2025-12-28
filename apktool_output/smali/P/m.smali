.class public abstract LP/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/StackTraceElement;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/StackTraceElement;

    sput-object v0, LP/m;->a:[Ljava/lang/StackTraceElement;

    return-void
.end method

.method public static final a(LD/n;LP/l;)LP/l;
    .locals 4

    sget-object v0, LP/h;->e:LP/h;

    invoke-interface {p1, v0}, LP/l;->a(Lo2/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    const v1, 0x48ae8da7

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2, v0}, LD/n;->L(ILjava/lang/Object;ILD/j0;)V

    sget-object v0, LP/i;->a:LP/i;

    new-instance v1, LA/i;

    const/4 v3, 0x6

    invoke-direct {v1, v3, p0}, LA/i;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, v0, v1}, LP/l;->b(Ljava/lang/Object;Lo2/e;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LP/l;

    invoke-virtual {p0, v2}, LD/n;->q(Z)V

    return-object p1
.end method

.method public static final b(LD/n;LP/l;)LP/l;
    .locals 1

    const v0, 0x1a365f2c

    invoke-virtual {p0, v0}, LD/n;->N(I)V

    invoke-static {p0, p1}, LP/m;->a(LD/n;LP/l;)LP/l;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LD/n;->q(Z)V

    return-object p1
.end method
