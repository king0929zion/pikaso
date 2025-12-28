.class public final LE/j;
.super LE/y;
.source "SourceFile"


# static fields
.field public static final c:LE/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LE/j;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, LE/y;-><init>(III)V

    sput-object v0, LE/j;->c:LE/j;

    return-void
.end method


# virtual methods
.method public final a(LE/z;LB0/a;LD/D0;LD/s;)V
    .locals 0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, p1}, LD/D0;->c(LD/c;)I

    move-result p1

    invoke-virtual {p3, p1}, LD/D0;->k(I)V

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
    invoke-super {p0, p1}, LE/y;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
