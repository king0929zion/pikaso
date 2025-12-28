.class public final LA/K;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public final synthetic e:LP/l;

.field public final synthetic f:LW/H;

.field public final synthetic g:J

.field public final synthetic h:F

.field public final synthetic i:Ls/g;

.field public final synthetic j:Z

.field public final synthetic k:LA0/c;

.field public final synthetic l:F

.field public final synthetic m:LL/a;


# direct methods
.method public constructor <init>(LP/l;LW/H;JFLs/g;ZLA0/c;FLL/a;)V
    .locals 0

    iput-object p1, p0, LA/K;->e:LP/l;

    iput-object p2, p0, LA/K;->f:LW/H;

    iput-wide p3, p0, LA/K;->g:J

    iput p5, p0, LA/K;->h:F

    iput-object p6, p0, LA/K;->i:Ls/g;

    iput-boolean p7, p0, LA/K;->j:Z

    iput-object p8, p0, LA/K;->k:LA0/c;

    iput p9, p0, LA/K;->l:F

    iput-object p10, p0, LA/K;->m:LL/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, LD/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    invoke-virtual {p1}, LD/n;->y()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LD/n;->K()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    sget-object p2, LA/w;->a:LD/M0;

    sget-object p2, Landroidx/compose/material3/MinimumInteractiveModifier;->a:Landroidx/compose/material3/MinimumInteractiveModifier;

    iget-object v0, p0, LA/K;->e:LP/l;

    invoke-interface {v0, p2}, LP/l;->c(LP/l;)LP/l;

    move-result-object p2

    iget-wide v0, p0, LA/K;->g:J

    iget v2, p0, LA/K;->h:F

    invoke-static {v0, v1, v2, p1}, LA/L;->b(JFLD/n;)J

    move-result-wide v0

    sget-object v2, Lo0/f0;->f:LD/M0;

    invoke-virtual {p1, v2}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v2

    iget v3, p0, LA/K;->l:F

    check-cast v2, LG0/b;

    invoke-interface {v2, v3}, LG0/b;->u(F)F

    move-result v2

    iget-object v3, p0, LA/K;->f:LW/H;

    invoke-static {p2, v3, v0, v1, v2}, LA/L;->a(LP/l;LW/H;JF)LP/l;

    move-result-object p2

    invoke-static {p1}, LA/D;->a(LD/n;)Lq/C;

    move-result-object v0

    iget-object v1, p0, LA/K;->k:LA0/c;

    iget-object v2, p0, LA/K;->i:Ls/g;

    iget-boolean v3, p0, LA/K;->j:Z

    invoke-static {p2, v2, v0, v3, v1}, Landroidx/compose/foundation/a;->b(LP/l;Ls/g;Lq/C;ZLA0/c;)LP/l;

    move-result-object p2

    const/4 v0, 0x1

    invoke-static {v0}, Lt/e;->d(Z)Ll0/k;

    move-result-object v1

    iget v2, p1, LD/n;->M:I

    invoke-virtual {p1}, LD/n;->m()LD/j0;

    move-result-object v3

    invoke-static {p1, p2}, LP/m;->b(LD/n;LP/l;)LP/l;

    move-result-object p2

    sget-object v4, Ln0/f;->c:Ln0/e;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Ln0/e;->b:Ln0/j;

    invoke-virtual {p1}, LD/n;->P()V

    iget-boolean v5, p1, LD/n;->L:Z

    if-eqz v5, :cond_2

    invoke-virtual {p1, v4}, LD/n;->l(Ln0/j;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, LD/n;->Y()V

    :goto_1
    sget-object v4, Ln0/e;->e:Ln0/d;

    invoke-static {p1, v1, v4}, LD/d;->G(LD/n;Ljava/lang/Object;Lo2/e;)V

    sget-object v1, Ln0/e;->d:Ln0/d;

    invoke-static {p1, v3, v1}, LD/d;->G(LD/n;Ljava/lang/Object;Lo2/e;)V

    sget-object v1, Ln0/e;->f:Ln0/d;

    iget-boolean v3, p1, LD/n;->L:Z

    if-nez v3, :cond_3

    invoke-virtual {p1}, LD/n;->H()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    :cond_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1, v3}, LD/n;->V(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, LD/n;->b(Ljava/lang/Object;Lo2/e;)V

    :cond_4
    sget-object v1, Ln0/e;->c:Ln0/d;

    invoke-static {p1, p2, v1}, LD/d;->G(LD/n;Ljava/lang/Object;Lo2/e;)V

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object v1, p0, LA/K;->m:LL/a;

    invoke-virtual {v1, p1, p2}, LL/a;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v0}, LD/n;->q(Z)V

    :goto_2
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
