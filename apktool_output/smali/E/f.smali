.class public final LE/f;
.super LE/y;
.source "SourceFile"


# static fields
.field public static final c:LE/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LE/f;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, LE/y;-><init>(III)V

    sput-object v0, LE/f;->c:LE/f;

    return-void
.end method


# virtual methods
.method public final a(LE/z;LB0/a;LD/D0;LD/s;)V
    .locals 1

    const-string p3, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>"

    invoke-static {p2, p3}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    array-length p4, p1

    :goto_0
    if-ge p3, p4, :cond_0

    aget-object v0, p1, p3

    invoke-virtual {p2, v0}, LB0/a;->g(Ljava/lang/Object;)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, La/a;->w(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "nodes"

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LE/y;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
