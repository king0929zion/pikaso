.class public final LE/w;
.super LE/y;
.source "SourceFile"


# static fields
.field public static final c:LE/w;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LE/w;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, LE/y;-><init>(III)V

    sput-object v0, LE/w;->c:LE/w;

    return-void
.end method


# virtual methods
.method public final a(LE/z;LB0/a;LD/D0;LD/s;)V
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object p3

    const/4 p4, 0x1

    invoke-virtual {p1, p4}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo2/e;

    iget-object p2, p2, LB0/a;->d:Ljava/lang/Object;

    invoke-interface {p1, p2, p3}, Lo2/e;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final c(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, La/a;->w(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "value"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, La/a;->w(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "block"

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, LE/y;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
