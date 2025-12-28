.class public final LE/n;
.super LE/y;
.source "SourceFile"


# static fields
.field public static final c:LE/n;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LE/n;

    const/4 v1, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, LE/y;-><init>(III)V

    sput-object v0, LE/n;->c:LE/n;

    return-void
.end method


# virtual methods
.method public final a(LE/z;LB0/a;LD/D0;LD/s;)V
    .locals 6

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD/B0;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LD/c;

    const/4 v4, 0x2

    invoke-virtual {p1, v4}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LE/c;

    invoke-virtual {v1}, LD/B0;->c()LD/D0;

    move-result-object v4

    :try_start_0
    iget-object v5, p1, LE/c;->c:LE/A;

    invoke-virtual {v5}, LE/A;->i0()Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object p1, p1, LE/c;->b:LE/A;

    invoke-virtual {p1, p2, v4, p4}, LE/A;->h0(LB0/a;LD/D0;LD/s;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v4, v0}, LD/D0;->e(Z)V

    invoke-virtual {p3}, LD/D0;->d()V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v3}, LD/B0;->a(LD/c;)I

    move-result p1

    invoke-virtual {p3, v1, p1}, LD/D0;->t(LD/B0;I)V

    invoke-virtual {p3}, LD/D0;->j()V

    return-void

    :cond_0
    :try_start_1
    const-string p1, "FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?"

    invoke-static {p1}, LD/d;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {v4, v2}, LD/D0;->e(Z)V

    throw p1
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
    const/4 v0, 0x2

    invoke-static {p1, v0}, La/a;->w(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "fixups"

    goto :goto_0

    :cond_2
    invoke-super {p0, p1}, LE/y;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
