.class public final LE/m;
.super LE/y;
.source "SourceFile"


# static fields
.field public static final c:LE/m;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LE/m;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, LE/y;-><init>(III)V

    sput-object v0, LE/m;->c:LE/m;

    return-void
.end method


# virtual methods
.method public final a(LE/z;LB0/a;LD/D0;LD/s;)V
    .locals 0

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LD/B0;

    const/4 p4, 0x0

    invoke-virtual {p1, p4}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD/c;

    invoke-virtual {p3}, LD/D0;->d()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2, p1}, LD/B0;->a(LD/c;)I

    move-result p1

    invoke-virtual {p3, p2, p1}, LD/D0;->t(LD/B0;I)V

    invoke-virtual {p3}, LD/D0;->j()V

    return-void
.end method

.method public final c(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, La/a;->w(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "anchor"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, La/a;->w(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "from"

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, LE/y;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
