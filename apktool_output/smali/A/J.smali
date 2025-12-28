.class public final LA/J;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public final synthetic e:LP/l;

.field public final synthetic f:LW/H;

.field public final synthetic g:J

.field public final synthetic h:F

.field public final synthetic i:F

.field public final synthetic j:LL/a;


# direct methods
.method public constructor <init>(LP/l;LW/H;JFFLL/a;)V
    .locals 0

    iput-object p1, p0, LA/J;->e:LP/l;

    iput-object p2, p0, LA/J;->f:LW/H;

    iput-wide p3, p0, LA/J;->g:J

    iput p5, p0, LA/J;->h:F

    iput p6, p0, LA/J;->i:F

    iput-object p7, p0, LA/J;->j:LL/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, LD/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    sget-object v0, Lc2/m;->a:Lc2/m;

    const/4 v1, 0x2

    if-ne p2, v1, :cond_1

    invoke-virtual {p1}, LD/n;->y()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LD/n;->K()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    iget-wide v2, p0, LA/J;->g:J

    iget p2, p0, LA/J;->h:F

    invoke-static {v2, v3, p2, p1}, LA/L;->b(JFLD/n;)J

    move-result-wide v2

    sget-object p2, Lo0/f0;->f:LD/M0;

    invoke-virtual {p1, p2}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object p2

    iget v4, p0, LA/J;->i:F

    check-cast p2, LG0/b;

    invoke-interface {p2, v4}, LG0/b;->u(F)F

    move-result p2

    iget-object v4, p0, LA/J;->f:LW/H;

    iget-object v5, p0, LA/J;->e:LP/l;

    invoke-static {v5, v4, v2, v3, p2}, LA/L;->a(LP/l;LW/H;JF)LP/l;

    move-result-object p2

    sget-object v2, LA/h;->g:LA/h;

    sget-object v3, Lt0/h;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v3, Landroidx/compose/ui/semantics/AppendedSemanticsElement;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4}, Landroidx/compose/ui/semantics/AppendedSemanticsElement;-><init>(Lo2/c;Z)V

    invoke-interface {p2, v3}, LP/l;->c(LP/l;)LP/l;

    move-result-object p2

    new-instance v2, LA/I;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Li2/j;-><init>(ILg2/d;)V

    sget-object v1, Lh0/o;->a:Lh0/f;

    new-instance v1, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    const/4 v5, 0x6

    invoke-direct {v1, v0, v3, v2, v5}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Lx/b;Lo2/e;I)V

    invoke-interface {p2, v1}, LP/l;->c(LP/l;)LP/l;

    move-result-object p2

    const/4 v1, 0x1

    invoke-static {v1}, Lt/e;->d(Z)Ll0/k;

    move-result-object v2

    iget v3, p1, LD/n;->M:I

    invoke-virtual {p1}, LD/n;->m()LD/j0;

    move-result-object v5

    invoke-static {p1, p2}, LP/m;->b(LD/n;LP/l;)LP/l;

    move-result-object p2

    sget-object v6, Ln0/f;->c:Ln0/e;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Ln0/e;->b:Ln0/j;

    invoke-virtual {p1}, LD/n;->P()V

    iget-boolean v7, p1, LD/n;->L:Z

    if-eqz v7, :cond_2

    invoke-virtual {p1, v6}, LD/n;->l(Ln0/j;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, LD/n;->Y()V

    :goto_1
    sget-object v6, Ln0/e;->e:Ln0/d;

    invoke-static {p1, v2, v6}, LD/d;->G(LD/n;Ljava/lang/Object;Lo2/e;)V

    sget-object v2, Ln0/e;->d:Ln0/d;

    invoke-static {p1, v5, v2}, LD/d;->G(LD/n;Ljava/lang/Object;Lo2/e;)V

    sget-object v2, Ln0/e;->f:Ln0/d;

    iget-boolean v5, p1, LD/n;->L:Z

    if-nez v5, :cond_3

    invoke-virtual {p1}, LD/n;->H()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    :cond_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p1, v5}, LD/n;->V(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1, v3, v2}, LD/n;->b(Ljava/lang/Object;Lo2/e;)V

    :cond_4
    sget-object v2, Ln0/e;->c:Ln0/d;

    invoke-static {p1, p2, v2}, LD/d;->G(LD/n;Ljava/lang/Object;Lo2/e;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object v2, p0, LA/J;->j:LL/a;

    invoke-virtual {v2, p1, p2}, LL/a;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v1}, LD/n;->q(Z)V

    :goto_2
    return-object v0
.end method
