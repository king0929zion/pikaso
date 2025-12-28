.class public final LB2/x;
.super LC2/d;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:Ly2/f;


# virtual methods
.method public final a(LC2/b;)Z
    .locals 4

    check-cast p1, LB2/v;

    iget-wide v0, p0, LB2/x;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-wide v0, p1, LB2/v;->l:J

    iget-wide v2, p1, LB2/v;->m:J

    cmp-long v2, v0, v2

    if-gez v2, :cond_1

    iput-wide v0, p1, LB2/v;->m:J

    :cond_1
    iput-wide v0, p0, LB2/x;->a:J

    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method public final b(LC2/b;)[Lg2/d;
    .locals 4

    check-cast p1, LB2/v;

    iget-wide v0, p0, LB2/x;->a:J

    const-wide/16 v2, -0x1

    iput-wide v2, p0, LB2/x;->a:J

    const/4 v2, 0x0

    iput-object v2, p0, LB2/x;->b:Ly2/f;

    invoke-virtual {p1, v0, v1}, LB2/v;->v(J)[Lg2/d;

    move-result-object p1

    return-object p1
.end method
