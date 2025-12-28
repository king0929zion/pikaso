.class public abstract LL/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:LL/f;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LL/b;->a:Ljava/lang/Object;

    new-instance v0, LL/f;

    const/4 v1, 0x0

    new-array v2, v1, [J

    new-array v3, v1, [Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3}, LL/f;-><init>(I[J[Ljava/lang/Object;)V

    sput-object v0, LL/b;->b:LL/f;

    return-void
.end method

.method public static final a(II)I
    .locals 0

    rem-int/lit8 p1, p1, 0xa

    mul-int/lit8 p1, p1, 0x3

    add-int/lit8 p1, p1, 0x1

    shl-int/2addr p0, p1

    return p0
.end method

.method public static final b(ILp2/h;LD/n;)LL/a;
    .locals 2

    invoke-virtual {p2}, LD/n;->H()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LD/l;->a:LD/U;

    if-ne v0, v1, :cond_0

    new-instance v0, LL/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1, p1}, LL/a;-><init>(IZLp2/h;)V

    invoke-virtual {p2, v0}, LD/n;->V(Ljava/lang/Object;)V

    :cond_0
    check-cast v0, LL/a;

    invoke-virtual {v0, p1}, LL/a;->f(Lp2/h;)V

    return-object v0
.end method

.method public static final c(LD/n0;LD/n0;)Z
    .locals 1

    if-eqz p0, :cond_1

    instance-of v0, p0, LD/n0;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LD/n0;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p0, p0, LD/n0;->c:LD/c;

    iget-object p1, p1, LD/n0;->c:LD/c;

    invoke-static {p0, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method
