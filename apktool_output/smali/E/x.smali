.class public final LE/x;
.super LE/y;
.source "SourceFile"


# static fields
.field public static final c:LE/x;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LE/x;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-direct {v0, v3, v1, v2}, LE/y;-><init>(III)V

    sput-object v0, LE/x;->c:LE/x;

    return-void
.end method


# virtual methods
.method public final a(LE/z;LB0/a;LD/D0;LD/s;)V
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, LE/z;->a(I)I

    move-result p1

    :goto_0
    if-ge p3, p1, :cond_0

    invoke-virtual {p2}, LB0/a;->M()V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lr2/a;->t(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "count"

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LE/y;->b(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
