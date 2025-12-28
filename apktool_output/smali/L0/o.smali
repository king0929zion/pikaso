.class public abstract Ll0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public d:I

.field public e:I

.field public f:J

.field public g:J

.field public h:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0, v0}, Lr2/a;->d(II)J

    move-result-wide v0

    iput-wide v0, p0, Ll0/o;->f:J

    sget-wide v0, Ll0/q;->a:J

    iput-wide v0, p0, Ll0/o;->g:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ll0/o;->h:J

    return-void
.end method


# virtual methods
.method public final D()I
    .locals 3

    iget-wide v0, p0, Ll0/o;->f:J

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public final F()V
    .locals 9

    iget-wide v0, p0, Ll0/o;->f:J

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    iget-wide v3, p0, Ll0/o;->g:J

    invoke-static {v3, v4}, LG0/a;->j(J)I

    move-result v1

    iget-wide v3, p0, Ll0/o;->g:J

    invoke-static {v3, v4}, LG0/a;->h(J)I

    move-result v3

    invoke-static {v0, v1, v3}, LZ/b;->k(III)I

    move-result v0

    iput v0, p0, Ll0/o;->d:I

    iget-wide v0, p0, Ll0/o;->f:J

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    long-to-int v0, v0

    iget-wide v5, p0, Ll0/o;->g:J

    invoke-static {v5, v6}, LG0/a;->i(J)I

    move-result v1

    iget-wide v5, p0, Ll0/o;->g:J

    invoke-static {v5, v6}, LG0/a;->g(J)I

    move-result v5

    invoke-static {v0, v1, v5}, LZ/b;->k(III)I

    move-result v0

    iput v0, p0, Ll0/o;->e:I

    iget v1, p0, Ll0/o;->d:I

    iget-wide v5, p0, Ll0/o;->f:J

    shr-long v7, v5, v2

    long-to-int v2, v7

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    and-long v2, v5, v3

    long-to-int v2, v2

    sub-int/2addr v0, v2

    div-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Lr2/a;->c(II)J

    move-result-wide v0

    iput-wide v0, p0, Ll0/o;->h:J

    return-void
.end method

.method public abstract G(JFLo2/c;)V
.end method

.method public final I(J)V
    .locals 2

    iget-wide v0, p0, Ll0/o;->f:J

    invoke-static {v0, v1, p1, p2}, La/a;->x(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iput-wide p1, p0, Ll0/o;->f:J

    invoke-virtual {p0}, Ll0/o;->F()V

    :cond_0
    return-void
.end method

.method public final K(J)V
    .locals 2

    iget-wide v0, p0, Ll0/o;->g:J

    invoke-static {v0, v1, p1, p2}, LG0/a;->b(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iput-wide p1, p0, Ll0/o;->g:J

    invoke-virtual {p0}, Ll0/o;->F()V

    :cond_0
    return-void
.end method

.method public abstract o()Ljava/lang/Object;
.end method
