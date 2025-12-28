.class public final Lq/u;
.super Ln0/i;
.source "SourceFile"

# interfaces
.implements LU/b;
.implements Ln0/l0;
.implements Ln0/l;
.implements LU/o;


# instance fields
.field public s:LU/p;

.field public final t:Lq/s;

.field public final u:Lq/v;

.field public final v:Lq/w;


# direct methods
.method public constructor <init>(Ls/g;)V
    .locals 1

    invoke-direct {p0}, Ln0/i;-><init>()V

    new-instance v0, Lq/s;

    invoke-direct {v0}, LP/k;-><init>()V

    iput-object p1, v0, Lq/s;->q:Ls/g;

    invoke-virtual {p0, v0}, Ln0/i;->f0(Ln0/h;)V

    iput-object v0, p0, Lq/u;->t:Lq/s;

    new-instance p1, Lq/v;

    invoke-direct {p1}, LP/k;-><init>()V

    invoke-virtual {p0, p1}, Ln0/i;->f0(Ln0/h;)V

    iput-object p1, p0, Lq/u;->u:Lq/v;

    new-instance p1, Lq/w;

    invoke-direct {p1}, LP/k;-><init>()V

    invoke-virtual {p0, p1}, Ln0/i;->f0(Ln0/h;)V

    iput-object p1, p0, Lq/u;->v:Lq/w;

    new-instance p1, LU/q;

    invoke-direct {p1}, LP/k;-><init>()V

    invoke-virtual {p0, p1}, Ln0/i;->f0(Ln0/h;)V

    return-void
.end method


# virtual methods
.method public final A(Lt0/g;)V
    .locals 4

    iget-object v0, p0, Lq/u;->s:LU/p;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LU/p;->a()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    sget-object v0, Lt0/p;->a:[Lv2/c;

    sget-object v0, Lt0/n;->k:Lt0/q;

    sget-object v2, Lt0/p;->a:[Lv2/c;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v0, v1}, Lt0/g;->b(Lt0/q;Ljava/lang/Object;)V

    new-instance v0, LA0/c;

    const/16 v1, 0x11

    invoke-direct {v0, v1, p0}, LA0/c;-><init>(ILjava/lang/Object;)V

    sget-object v1, Lt0/f;->s:Lt0/q;

    new-instance v2, Lt0/a;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Lt0/a;-><init>(Ljava/lang/String;Lc2/c;)V

    invoke-virtual {p1, v1, v2}, Lt0/g;->b(Lt0/q;Ljava/lang/Object;)V

    return-void
.end method

.method public final V()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final i0(Ls/g;)V
    .locals 4

    iget-object v0, p0, Lq/u;->t:Lq/s;

    iget-object v1, v0, Lq/s;->q:Ls/g;

    invoke-static {v1, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v0, Lq/s;->q:Ls/g;

    if-eqz v1, :cond_0

    iget-object v2, v0, Lq/s;->r:Ls/b;

    if-eqz v2, :cond_0

    new-instance v3, Ls/c;

    invoke-direct {v3, v2}, Ls/c;-><init>(Ls/b;)V

    invoke-virtual {v1, v3}, Ls/g;->b(Ls/f;)V

    :cond_0
    const/4 v1, 0x0

    iput-object v1, v0, Lq/s;->r:Ls/b;

    iput-object p1, v0, Lq/s;->q:Ls/g;

    :cond_1
    return-void
.end method

.method public final p(Ln0/Y;)V
    .locals 1

    iget-object v0, p0, Lq/u;->v:Lq/w;

    invoke-virtual {v0, p1}, Lq/w;->p(Ln0/Y;)V

    return-void
.end method

.method public final z(LU/p;)V
    .locals 6

    iget-object v0, p0, Lq/u;->s:LU/p;

    invoke-static {v0, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p1}, LU/p;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LP/k;->U()Ly2/u;

    move-result-object v2

    new-instance v3, Lq/t;

    invoke-direct {v3, p0, v1}, Lq/t;-><init>(Lq/u;Lg2/d;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static {v2, v1, v5, v3, v4}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    :cond_0
    iget-boolean v2, p0, LP/k;->p:Z

    if-eqz v2, :cond_1

    invoke-static {p0}, Ln0/C;->m(Ln0/l0;)V

    :cond_1
    iget-object v2, p0, Lq/u;->t:Lq/s;

    iget-object v3, v2, Lq/s;->q:Ls/g;

    if-eqz v3, :cond_4

    if-eqz v0, :cond_3

    iget-object v4, v2, Lq/s;->r:Ls/b;

    if-eqz v4, :cond_2

    new-instance v5, Ls/c;

    invoke-direct {v5, v4}, Ls/c;-><init>(Ls/b;)V

    invoke-virtual {v2, v3, v5}, Lq/s;->f0(Ls/g;Ls/f;)V

    iput-object v1, v2, Lq/s;->r:Ls/b;

    :cond_2
    new-instance v1, Ls/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, v3, v1}, Lq/s;->f0(Ls/g;Ls/f;)V

    iput-object v1, v2, Lq/s;->r:Ls/b;

    goto :goto_0

    :cond_3
    iget-object v4, v2, Lq/s;->r:Ls/b;

    if-eqz v4, :cond_4

    new-instance v5, Ls/c;

    invoke-direct {v5, v4}, Ls/c;-><init>(Ls/b;)V

    invoke-virtual {v2, v3, v5}, Lq/s;->f0(Ls/g;Ls/f;)V

    iput-object v1, v2, Lq/s;->r:Ls/b;

    :cond_4
    :goto_0
    iget-object v1, p0, Lq/u;->v:Lq/w;

    iget-boolean v2, v1, Lq/w;->q:Z

    if-ne v0, v2, :cond_5

    goto :goto_2

    :cond_5
    sget-object v2, Lq/x;->q:Lq/I;

    if-nez v0, :cond_6

    iget-boolean v3, v1, LP/k;->p:Z

    if-eqz v3, :cond_7

    invoke-static {v1, v2}, Ln0/C;->i(Ln0/h;Ljava/lang/Object;)Ln0/o0;

    goto :goto_1

    :cond_6
    iget-object v3, v1, Lq/w;->r:Ln0/Y;

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ln0/Y;->q0()LP/k;

    move-result-object v3

    iget-boolean v3, v3, LP/k;->p:Z

    if-eqz v3, :cond_7

    iget-boolean v3, v1, LP/k;->p:Z

    if-eqz v3, :cond_7

    invoke-static {v1, v2}, Ln0/C;->i(Ln0/h;Ljava/lang/Object;)Ln0/o0;

    :cond_7
    :goto_1
    iput-boolean v0, v1, Lq/w;->q:Z

    :goto_2
    iget-object v1, p0, Lq/u;->u:Lq/v;

    if-eqz v0, :cond_9

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lp2/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v2, LD/q0;

    const/4 v3, 0x6

    invoke-direct {v2, v0, v3, v1}, LD/q0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {v1, v2}, Ln0/C;->o(LP/k;Lo2/a;)V

    iget-object v0, v0, Lp2/o;->d:Ljava/lang/Object;

    if-nez v0, :cond_8

    goto :goto_3

    :cond_8
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_9
    :goto_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lq/u;->s:LU/p;

    :cond_a
    return-void
.end method
