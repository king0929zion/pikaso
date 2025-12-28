.class public final LD2/p;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LU/q;Landroidx/compose/ui/focus/a;Lo2/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LD2/p;->e:I

    .line 1
    iput-object p1, p0, LD2/p;->f:Ljava/lang/Object;

    iput-object p2, p0, LD2/p;->g:Ljava/lang/Object;

    check-cast p3, Lp2/h;

    iput-object p3, p0, LD2/p;->h:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, LD2/p;->e:I

    iput-object p1, p0, LD2/p;->f:Ljava/lang/Object;

    iput-object p2, p0, LD2/p;->g:Ljava/lang/Object;

    iput-object p3, p0, LD2/p;->h:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, LD2/p;->e:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll0/n;

    iget-object v0, p0, LD2/p;->h:Ljava/lang/Object;

    check-cast v0, Lt/q;

    iget-object v1, v0, Lt/q;->q:Lt/p;

    iget-object v2, p0, LD2/p;->g:Ljava/lang/Object;

    check-cast v2, Ln0/L;

    invoke-virtual {v2}, Ln0/L;->getLayoutDirection()LG0/f;

    move-result-object v3

    sget-object v4, LG0/f;->d:LG0/f;

    if-ne v3, v4, :cond_0

    iget v1, v1, Lt/p;->a:F

    goto :goto_0

    :cond_0
    iget v1, v1, Lt/p;->c:F

    :goto_0
    invoke-interface {v2, v1}, LG0/b;->b(F)I

    move-result v1

    iget-object v0, v0, Lt/q;->q:Lt/p;

    iget v0, v0, Lt/p;->b:F

    invoke-interface {v2, v0}, LG0/b;->b(F)I

    move-result v0

    iget-object v2, p0, LD2/p;->f:Ljava/lang/Object;

    check-cast v2, Ll0/o;

    invoke-static {p1, v2, v1, v0}, Ll0/n;->d(Ll0/n;Ll0/o;II)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_0
    check-cast p1, Ll0/n;

    iget-object v0, p0, LD2/p;->f:Ljava/lang/Object;

    check-cast v0, Lt/o;

    iget-boolean v1, v0, Lt/o;->u:Z

    iget-object v2, p0, LD2/p;->h:Ljava/lang/Object;

    check-cast v2, Ln0/L;

    iget-object v3, p0, LD2/p;->g:Ljava/lang/Object;

    check-cast v3, Ll0/o;

    if-eqz v1, :cond_1

    iget v1, v0, Lt/o;->q:F

    invoke-interface {v2, v1}, LG0/b;->b(F)I

    move-result v1

    iget v0, v0, Lt/o;->r:F

    invoke-interface {v2, v0}, LG0/b;->b(F)I

    move-result v0

    invoke-static {p1, v3, v1, v0}, Ll0/n;->f(Ll0/n;Ll0/o;II)V

    goto :goto_1

    :cond_1
    iget v1, v0, Lt/o;->q:F

    invoke-interface {v2, v1}, LG0/b;->b(F)I

    move-result v1

    iget v0, v0, Lt/o;->r:F

    invoke-interface {v2, v0}, LG0/b;->b(F)I

    move-result v0

    invoke-static {p1, v3, v1, v0}, Ll0/n;->d(Ll0/n;Ll0/o;II)V

    :goto_1
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_1
    check-cast p1, LU/q;

    iget-object v0, p0, LD2/p;->f:Ljava/lang/Object;

    check-cast v0, LU/q;

    invoke-static {p1, v0}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    iget-object v0, p0, LD2/p;->g:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/focus/a;

    iget-object v0, v0, Landroidx/compose/ui/focus/a;->d:LU/q;

    invoke-static {p1, v0}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LD2/p;->h:Ljava/lang/Object;

    check-cast v0, Lp2/h;

    invoke-interface {v0, p1}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Focus search landed at the root."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    check-cast p1, Ln0/o0;

    move-object v0, p1

    check-cast v0, LS/d;

    iget-object v1, p0, LD2/p;->g:Ljava/lang/Object;

    check-cast v1, LS/d;

    invoke-static {v1}, Ln0/C;->r(Ln0/h;)Ln0/e0;

    move-result-object v1

    check-cast v1, Lo0/u;

    invoke-virtual {v1}, Lo0/u;->getDragAndDropManager()LS/a;

    move-result-object v1

    check-cast v1, Lo0/j0;

    iget-object v1, v1, Lo0/j0;->b:Ln/g;

    invoke-virtual {v1, v0}, Ln/g;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, LD2/p;->h:Ljava/lang/Object;

    check-cast v1, LA/t;

    iget-object v1, v1, LA/t;->e:Ljava/lang/Object;

    check-cast v1, Landroid/view/DragEvent;

    invoke-virtual {v1}, Landroid/view/DragEvent;->getX()F

    move-result v2

    invoke-virtual {v1}, Landroid/view/DragEvent;->getY()F

    move-result v1

    invoke-static {v2, v1}, Lr2/a;->f(FF)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, La/a;->g(LS/d;J)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LD2/p;->f:Ljava/lang/Object;

    check-cast v0, Lp2/o;

    iput-object p1, v0, Lp2/o;->d:Ljava/lang/Object;

    sget-object p1, Ln0/n0;->f:Ln0/n0;

    goto :goto_3

    :cond_4
    sget-object p1, Ln0/n0;->d:Ln0/n0;

    :goto_3
    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    const/4 p1, 0x0

    iget-object v0, p0, LD2/p;->f:Ljava/lang/Object;

    check-cast v0, Lo2/c;

    iget-object v1, p0, LD2/p;->g:Ljava/lang/Object;

    invoke-static {v0, v1, p1}, LD2/a;->a(Lo2/c;Ljava/lang/Object;LB1/c;)LB1/c;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v0, p0, LD2/p;->h:Ljava/lang/Object;

    check-cast v0, Lg2/i;

    invoke-static {v0, p1}, Ly2/v;->h(Lg2/i;Ljava/lang/Throwable;)V

    :cond_5
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
