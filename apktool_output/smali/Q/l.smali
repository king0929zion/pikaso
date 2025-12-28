.class public final Lq/l;
.super Ln0/i;
.source "SourceFile"

# interfaces
.implements Ln0/j0;
.implements Lg0/c;
.implements LU/b;
.implements Ln0/l0;
.implements Ln0/o0;


# static fields
.field public static final J:Lq/I;


# instance fields
.field public A:Lh0/r;

.field public B:Ln0/h;

.field public C:Ls/i;

.field public D:Ls/d;

.field public final E:Ljava/util/LinkedHashMap;

.field public F:J

.field public G:Ls/g;

.field public H:Z

.field public final I:Lq/I;

.field public s:Ls/g;

.field public t:Lq/H;

.field public u:Ljava/lang/String;

.field public v:Lt0/e;

.field public w:Z

.field public x:LA0/c;

.field public final y:Lq/q;

.field public final z:Lq/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq/I;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq/l;->J:Lq/I;

    return-void
.end method

.method public constructor <init>(Ls/g;Lq/H;ZLjava/lang/String;Lt0/e;LA0/c;)V
    .locals 0

    invoke-direct {p0}, Ln0/i;-><init>()V

    iput-object p1, p0, Lq/l;->s:Ls/g;

    iput-object p2, p0, Lq/l;->t:Lq/H;

    iput-object p4, p0, Lq/l;->u:Ljava/lang/String;

    iput-object p5, p0, Lq/l;->v:Lt0/e;

    iput-boolean p3, p0, Lq/l;->w:Z

    iput-object p6, p0, Lq/l;->x:LA0/c;

    new-instance p2, Lq/q;

    invoke-direct {p2}, LP/k;-><init>()V

    iput-object p2, p0, Lq/l;->y:Lq/q;

    new-instance p2, Lq/u;

    invoke-direct {p2, p1}, Lq/u;-><init>(Ls/g;)V

    iput-object p2, p0, Lq/l;->z:Lq/u;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lq/l;->E:Ljava/util/LinkedHashMap;

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lq/l;->F:J

    iget-object p1, p0, Lq/l;->s:Ls/g;

    iput-object p1, p0, Lq/l;->G:Ls/g;

    if-nez p1, :cond_0

    iget-object p1, p0, Lq/l;->t:Lq/H;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lq/l;->H:Z

    sget-object p1, Lq/l;->J:Lq/I;

    iput-object p1, p0, Lq/l;->I:Lq/I;

    return-void
.end method


# virtual methods
.method public final A(Lt0/g;)V
    .locals 4

    iget-object v0, p0, Lq/l;->v:Lt0/e;

    if-eqz v0, :cond_0

    iget v0, v0, Lt0/e;->a:I

    invoke-static {p1, v0}, Lt0/p;->c(Lt0/g;I)V

    :cond_0
    iget-object v0, p0, Lq/l;->u:Ljava/lang/String;

    new-instance v1, LA0/c;

    const/16 v2, 0x10

    invoke-direct {v1, v2, p0}, LA0/c;-><init>(ILjava/lang/Object;)V

    sget-object v2, Lt0/p;->a:[Lv2/c;

    sget-object v2, Lt0/f;->b:Lt0/q;

    new-instance v3, Lt0/a;

    invoke-direct {v3, v0, v1}, Lt0/a;-><init>(Ljava/lang/String;Lc2/c;)V

    invoke-virtual {p1, v2, v3}, Lt0/g;->b(Lt0/q;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lq/l;->w:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq/l;->z:Lq/u;

    invoke-virtual {v0, p1}, Lq/u;->A(Lt0/g;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lt0/n;->i:Lt0/q;

    sget-object v1, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, v0, v1}, Lt0/g;->b(Lt0/q;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final B()V
    .locals 3

    iget-object v0, p0, Lq/l;->s:Ls/g;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lq/l;->D:Ls/d;

    if-eqz v1, :cond_0

    new-instance v2, Ls/e;

    invoke-direct {v2, v1}, Ls/e;-><init>(Ls/d;)V

    invoke-virtual {v0, v2}, Ls/g;->b(Ls/f;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lq/l;->D:Ls/d;

    iget-object v0, p0, Lq/l;->A:Lh0/r;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lh0/r;->B()V

    :cond_1
    return-void
.end method

.method public final G()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final V()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final Y()V
    .locals 1

    iget-boolean v0, p0, Lq/l;->H:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lq/l;->j0()V

    :cond_0
    iget-boolean v0, p0, Lq/l;->w:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq/l;->y:Lq/q;

    invoke-virtual {p0, v0}, Ln0/i;->f0(Ln0/h;)V

    iget-object v0, p0, Lq/l;->z:Lq/u;

    invoke-virtual {p0, v0}, Ln0/i;->f0(Ln0/h;)V

    :cond_1
    return-void
.end method

.method public final Z()V
    .locals 2

    invoke-virtual {p0}, Lq/l;->i0()V

    iget-object v0, p0, Lq/l;->G:Ls/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lq/l;->s:Ls/g;

    :cond_0
    iget-object v0, p0, Lq/l;->B:Ln0/h;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Ln0/i;->g0(Ln0/h;)V

    :cond_1
    iput-object v1, p0, Lq/l;->B:Ln0/h;

    return-void
.end method

.method public final d(Landroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final g(Landroid/view/KeyEvent;)Z
    .locals 12

    invoke-virtual {p0}, Lq/l;->j0()V

    iget-boolean v0, p0, Lq/l;->w:Z

    iget-object v1, p0, Lq/l;->E:Ljava/util/LinkedHashMap;

    const/4 v2, 0x3

    const/16 v3, 0xa0

    const/16 v4, 0x42

    const/16 v5, 0x17

    const/16 v6, 0x20

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v0, :cond_2

    sget v0, Lq/m;->b:I

    invoke-static {p1}, LZ0/d;->A(Landroid/view/KeyEvent;)I

    move-result v0

    const/4 v10, 0x2

    if-ne v0, v10, :cond_2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-static {v0}, LZ/b;->a(I)J

    move-result-wide v10

    shr-long/2addr v10, v6

    long-to-int v0, v10

    if-eq v0, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-static {v0}, LZ/b;->a(I)J

    move-result-wide v3

    new-instance v0, Lg0/a;

    invoke-direct {v0, v3, v4}, Lg0/a;-><init>(J)V

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    new-instance v0, Ls/i;

    iget-wide v3, p0, Lq/l;->F:J

    invoke-direct {v0, v3, v4}, Ls/i;-><init>(J)V

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, LZ/b;->a(I)J

    move-result-wide v3

    new-instance p1, Lg0/a;

    invoke-direct {p1, v3, v4}, Lg0/a;-><init>(J)V

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lq/l;->s:Ls/g;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LP/k;->U()Ly2/u;

    move-result-object p1

    new-instance v1, Lq/e;

    invoke-direct {v1, p0, v0, v9}, Lq/e;-><init>(Lq/l;Ls/i;Lg2/d;)V

    invoke-static {p1, v9, v7, v1, v2}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    :cond_1
    :goto_0
    move v7, v8

    goto :goto_2

    :cond_2
    :goto_1
    iget-boolean v0, p0, Lq/l;->w:Z

    if-eqz v0, :cond_5

    sget v0, Lq/m;->b:I

    invoke-static {p1}, LZ0/d;->A(Landroid/view/KeyEvent;)I

    move-result v0

    if-ne v0, v8, :cond_5

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-static {v0}, LZ/b;->a(I)J

    move-result-wide v10

    shr-long/2addr v10, v6

    long-to-int v0, v10

    if-eq v0, v5, :cond_3

    if-eq v0, v4, :cond_3

    if-eq v0, v3, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, LZ/b;->a(I)J

    move-result-wide v3

    new-instance p1, Lg0/a;

    invoke-direct {p1, v3, v4}, Lg0/a;-><init>(J)V

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls/i;

    if-eqz p1, :cond_4

    iget-object v0, p0, Lq/l;->s:Ls/g;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LP/k;->U()Ly2/u;

    move-result-object v0

    new-instance v1, Lq/f;

    invoke-direct {v1, p0, p1, v9}, Lq/f;-><init>(Lq/l;Ls/i;Lg2/d;)V

    invoke-static {v0, v9, v7, v1, v2}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    :cond_4
    iget-object p1, p0, Lq/l;->x:LA0/c;

    invoke-virtual {p1}, LA0/c;->c()Ljava/lang/Object;

    goto :goto_0

    :cond_5
    :goto_2
    return v7
.end method

.method public final i0()V
    .locals 5

    iget-object v0, p0, Lq/l;->s:Ls/g;

    iget-object v1, p0, Lq/l;->E:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lq/l;->C:Ls/i;

    if-eqz v2, :cond_0

    new-instance v3, Ls/h;

    invoke-direct {v3, v2}, Ls/h;-><init>(Ls/i;)V

    invoke-virtual {v0, v3}, Ls/g;->b(Ls/f;)V

    :cond_0
    iget-object v2, p0, Lq/l;->D:Ls/d;

    if-eqz v2, :cond_1

    new-instance v3, Ls/e;

    invoke-direct {v3, v2}, Ls/e;-><init>(Ls/d;)V

    invoke-virtual {v0, v3}, Ls/g;->b(Ls/f;)V

    :cond_1
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls/i;

    new-instance v4, Ls/h;

    invoke-direct {v4, v3}, Ls/h;-><init>(Ls/i;)V

    invoke-virtual {v0, v4}, Ls/g;->b(Ls/f;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lq/l;->C:Ls/i;

    iput-object v0, p0, Lq/l;->D:Ls/d;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    return-void
.end method

.method public final j()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq/l;->I:Lq/I;

    return-object v0
.end method

.method public final j0()V
    .locals 3

    iget-object v0, p0, Lq/l;->B:Ln0/h;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lq/l;->t:Lq/H;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lq/l;->s:Ls/g;

    if-nez v1, :cond_1

    new-instance v1, Ls/g;

    invoke-direct {v1}, Ls/g;-><init>()V

    iput-object v1, p0, Lq/l;->s:Ls/g;

    :cond_1
    iget-object v1, p0, Lq/l;->z:Lq/u;

    iget-object v2, p0, Lq/l;->s:Ls/g;

    invoke-virtual {v1, v2}, Lq/u;->i0(Ls/g;)V

    iget-object v1, p0, Lq/l;->s:Ls/g;

    invoke-static {v1}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lq/H;->a(Ls/g;)Ln0/h;

    move-result-object v0

    invoke-virtual {p0, v0}, Ln0/i;->f0(Ln0/h;)V

    iput-object v0, p0, Lq/l;->B:Ln0/h;

    :cond_2
    return-void
.end method

.method public final y(Lh0/f;Lh0/g;J)V
    .locals 8

    const/16 v0, 0x21

    shr-long v1, p3, v0

    const/16 v3, 0x20

    shl-long/2addr v1, v3

    shl-long v4, p3, v3

    shr-long/2addr v4, v0

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    or-long v0, v1, v4

    shr-long v2, v0, v3

    long-to-int v2, v2

    int-to-float v2, v2

    and-long/2addr v0, v6

    long-to-int v0, v0

    int-to-float v0, v0

    invoke-static {v2, v0}, Lr2/a;->f(FF)J

    move-result-wide v0

    iput-wide v0, p0, Lq/l;->F:J

    invoke-virtual {p0}, Lq/l;->j0()V

    iget-boolean v0, p0, Lq/l;->w:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v0, Lh0/g;->e:Lh0/g;

    if-ne p2, v0, :cond_1

    iget v0, p1, Lh0/f;->b:I

    const/4 v2, 0x4

    invoke-static {v0, v2}, LZ/b;->p(II)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x3

    if-eqz v2, :cond_0

    invoke-virtual {p0}, LP/k;->U()Ly2/u;

    move-result-object v0

    new-instance v2, Lq/g;

    invoke-direct {v2, p0, v1}, Lq/g;-><init>(Lq/l;Lg2/d;)V

    invoke-static {v0, v1, v3, v2, v4}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    goto :goto_0

    :cond_0
    const/4 v2, 0x5

    invoke-static {v0, v2}, LZ/b;->p(II)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LP/k;->U()Ly2/u;

    move-result-object v0

    new-instance v2, Lq/h;

    invoke-direct {v2, p0, v1}, Lq/h;-><init>(Lq/l;Lg2/d;)V

    invoke-static {v0, v1, v3, v2, v4}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    :cond_1
    :goto_0
    iget-object v0, p0, Lq/l;->A:Lh0/r;

    if-nez v0, :cond_2

    new-instance v0, Lq/i;

    invoke-direct {v0, p0, v1}, Lq/i;-><init>(Lq/l;Lg2/d;)V

    sget-object v2, Lh0/o;->a:Lh0/f;

    new-instance v2, Lh0/r;

    invoke-direct {v2, v1, v1, v1, v0}, Lh0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lo2/e;)V

    invoke-virtual {p0, v2}, Ln0/i;->f0(Ln0/h;)V

    iput-object v2, p0, Lq/l;->A:Lh0/r;

    :cond_2
    iget-object v0, p0, Lq/l;->A:Lh0/r;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1, p2, p3, p4}, Lh0/r;->y(Lh0/f;Lh0/g;J)V

    :cond_3
    return-void
.end method

.method public final z(LU/p;)V
    .locals 1

    invoke-virtual {p1}, LU/p;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lq/l;->j0()V

    :cond_0
    iget-boolean v0, p0, Lq/l;->w:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq/l;->z:Lq/u;

    invoke-virtual {v0, p1}, Lq/u;->z(LU/p;)V

    :cond_1
    return-void
.end method
