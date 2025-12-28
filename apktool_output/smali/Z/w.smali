.class public abstract Lz/w;
.super LP/k;
.source "SourceFile"

# interfaces
.implements Ln0/g;
.implements Ln0/k;
.implements Ln0/r;


# instance fields
.field public final q:Ls/g;

.field public final r:Z

.field public final s:F

.field public final t:LA/t;

.field public final u:LA/u;

.field public v:LZ/a;

.field public w:F

.field public x:J

.field public y:Z

.field public final z:Ln/x;


# direct methods
.method public constructor <init>(Ls/g;ZFLA/t;LA/u;)V
    .locals 0

    invoke-direct {p0}, LP/k;-><init>()V

    iput-object p1, p0, Lz/w;->q:Ls/g;

    iput-boolean p2, p0, Lz/w;->r:Z

    iput p3, p0, Lz/w;->s:F

    iput-object p4, p0, Lz/w;->t:LA/t;

    iput-object p5, p0, Lz/w;->u:LA/u;

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lz/w;->x:J

    new-instance p1, Ln/x;

    invoke-direct {p1}, Ln/x;-><init>()V

    iput-object p1, p0, Lz/w;->z:Ln/x;

    return-void
.end method


# virtual methods
.method public final C(Ln0/B;)V
    .locals 4

    invoke-virtual {p1}, Ln0/B;->a()V

    iget-object v0, p0, Lz/w;->v:LZ/a;

    if-eqz v0, :cond_0

    iget v1, p0, Lz/w;->w:F

    iget-object v2, p0, Lz/w;->t:LA/t;

    invoke-virtual {v2}, LA/t;->z()J

    move-result-wide v2

    invoke-virtual {v0, p1, v1, v2, v3}, LZ/a;->a(Ln0/B;FJ)V

    :cond_0
    invoke-virtual {p0, p1}, Lz/w;->g0(Ln0/B;)V

    return-void
.end method

.method public final V()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final Y()V
    .locals 5

    invoke-virtual {p0}, LP/k;->U()Ly2/u;

    move-result-object v0

    new-instance v1, Lz/v;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lz/v;-><init>(Lz/w;Lg2/d;)V

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-static {v0, v2, v4, v1, v3}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    return-void
.end method

.method public abstract f0(Ls/i;JF)V
.end method

.method public abstract g0(Ln0/B;)V
.end method

.method public final h0(Ls/k;)V
    .locals 3

    instance-of v0, p1, Ls/i;

    if-eqz v0, :cond_0

    check-cast p1, Ls/i;

    iget-wide v0, p0, Lz/w;->x:J

    iget v2, p0, Lz/w;->w:F

    invoke-virtual {p0, p1, v0, v1, v2}, Lz/w;->f0(Ls/i;JF)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ls/j;

    if-eqz v0, :cond_1

    check-cast p1, Ls/j;

    iget-object p1, p1, Ls/j;->a:Ls/i;

    invoke-virtual {p0, p1}, Lz/w;->i0(Ls/i;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ls/h;

    if-eqz v0, :cond_2

    check-cast p1, Ls/h;

    iget-object p1, p1, Ls/h;->a:Ls/i;

    invoke-virtual {p0, p1}, Lz/w;->i0(Ls/i;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public abstract i0(Ls/i;)V
.end method

.method public final o(J)V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz/w;->y:Z

    invoke-static {p0}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v0

    iget-object v0, v0, Ln0/z;->s:LG0/b;

    invoke-static {p1, p2}, Lr2/a;->c0(J)J

    move-result-wide p1

    iput-wide p1, p0, Lz/w;->x:J

    iget p1, p0, Lz/w;->s:F

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-boolean p1, p0, Lz/w;->r:Z

    iget-wide v1, p0, Lz/w;->x:J

    invoke-static {v0, p1, v1, v2}, Lz/q;->a(LG0/b;ZJ)F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, LG0/b;->u(F)F

    move-result p1

    :goto_0
    iput p1, p0, Lz/w;->w:F

    iget-object p1, p0, Lz/w;->z:Ln/x;

    iget-object p2, p1, Ln/x;->a:[Ljava/lang/Object;

    iget v0, p1, Ln/x;->b:I

    const/4 v1, 0x0

    move v2, v1

    :goto_1
    if-ge v2, v0, :cond_1

    aget-object v3, p2, v2

    check-cast v3, Ls/k;

    invoke-virtual {p0, v3}, Lz/w;->h0(Ls/k;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    iget-object p2, p1, Ln/x;->a:[Ljava/lang/Object;

    iget v0, p1, Ln/x;->b:I

    invoke-static {p2, v1, v0}, Ld2/j;->c0([Ljava/lang/Object;II)V

    iput v1, p1, Ln/x;->b:I

    return-void
.end method
