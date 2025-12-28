.class public abstract Ll0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ll0/n;Ll0/o;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of p0, p1, Ln0/Q;

    if-eqz p0, :cond_0

    check-cast p1, Ln0/Q;

    invoke-interface {p1}, Ln0/Q;->z()V

    :cond_0
    return-void
.end method

.method public static d(Ll0/n;Ll0/o;II)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, p3}, Lr2/a;->c(II)J

    move-result-wide p2

    invoke-static {p0, p1}, Ll0/n;->a(Ll0/n;Ll0/o;)V

    iget-wide v0, p1, Ll0/o;->h:J

    invoke-static {p2, p3, v0, v1}, La/a;->X(JJ)J

    move-result-wide p2

    const/4 p0, 0x0

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0, p0}, Ll0/o;->G(JFLo2/c;)V

    return-void
.end method

.method public static e(Ll0/n;Ll0/o;J)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, p1}, Ll0/n;->a(Ll0/n;Ll0/o;)V

    iget-wide v0, p1, Ll0/o;->h:J

    invoke-static {p2, p3, v0, v1}, La/a;->X(JJ)J

    move-result-wide p2

    const/4 p0, 0x0

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0, p0}, Ll0/o;->G(JFLo2/c;)V

    return-void
.end method

.method public static f(Ll0/n;Ll0/o;II)V
    .locals 6

    invoke-static {p2, p3}, Lr2/a;->c(II)J

    move-result-wide p2

    invoke-virtual {p0}, Ll0/n;->b()LG0/f;

    move-result-object v0

    sget-object v1, LG0/f;->d:LG0/f;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Ll0/n;->c()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll0/n;->c()I

    move-result v0

    iget v1, p1, Ll0/o;->d:I

    sub-int/2addr v0, v1

    const/16 v1, 0x20

    shr-long v4, p2, v1

    long-to-int v1, v4

    sub-int/2addr v0, v1

    const-wide v4, 0xffffffffL

    and-long/2addr p2, v4

    long-to-int p2, p2

    invoke-static {v0, p2}, Lr2/a;->c(II)J

    move-result-wide p2

    invoke-static {p0, p1}, Ll0/n;->a(Ll0/n;Ll0/o;)V

    iget-wide v0, p1, Ll0/o;->h:J

    invoke-static {p2, p3, v0, v1}, La/a;->X(JJ)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3, v2, v3}, Ll0/o;->G(JFLo2/c;)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {p0, p1}, Ll0/n;->a(Ll0/n;Ll0/o;)V

    iget-wide v0, p1, Ll0/o;->h:J

    invoke-static {p2, p3, v0, v1}, La/a;->X(JJ)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3, v2, v3}, Ll0/o;->G(JFLo2/c;)V

    :goto_1
    return-void
.end method

.method public static g(Ll0/n;Ll0/o;)V
    .locals 8

    sget v0, Ll0/q;->b:I

    sget-object v0, Ll0/p;->f:Ll0/p;

    const/4 v1, 0x0

    invoke-static {v1, v1}, Lr2/a;->c(II)J

    move-result-wide v1

    invoke-virtual {p0}, Ll0/n;->b()LG0/f;

    move-result-object v3

    sget-object v4, LG0/f;->d:LG0/f;

    const/4 v5, 0x0

    if-eq v3, v4, :cond_1

    invoke-virtual {p0}, Ll0/n;->c()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll0/n;->c()I

    move-result v3

    iget v4, p1, Ll0/o;->d:I

    sub-int/2addr v3, v4

    const/16 v4, 0x20

    shr-long v6, v1, v4

    long-to-int v4, v6

    sub-int/2addr v3, v4

    const-wide v6, 0xffffffffL

    and-long/2addr v1, v6

    long-to-int v1, v1

    invoke-static {v3, v1}, Lr2/a;->c(II)J

    move-result-wide v1

    invoke-static {p0, p1}, Ll0/n;->a(Ll0/n;Ll0/o;)V

    iget-wide v3, p1, Ll0/o;->h:J

    invoke-static {v1, v2, v3, v4}, La/a;->X(JJ)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2, v5, v0}, Ll0/o;->G(JFLo2/c;)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {p0, p1}, Ll0/n;->a(Ll0/n;Ll0/o;)V

    iget-wide v3, p1, Ll0/o;->h:J

    invoke-static {v1, v2, v3, v4}, La/a;->X(JJ)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2, v5, v0}, Ll0/o;->G(JFLo2/c;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public abstract b()LG0/f;
.end method

.method public abstract c()I
.end method
