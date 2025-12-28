.class public final Landroidx/compose/foundation/b;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/f;


# instance fields
.field public final synthetic e:Lq/C;

.field public final synthetic f:Z

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lt0/e;

.field public final synthetic i:LA0/c;


# direct methods
.method public constructor <init>(Lq/C;ZLjava/lang/String;Lt0/e;LA0/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/b;->e:Lq/C;

    iput-boolean p2, p0, Landroidx/compose/foundation/b;->f:Z

    iput-object p3, p0, Landroidx/compose/foundation/b;->g:Ljava/lang/String;

    iput-object p4, p0, Landroidx/compose/foundation/b;->h:Lt0/e;

    iput-object p5, p0, Landroidx/compose/foundation/b;->i:LA0/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;)Ljava/lang/Object;
    .locals 7

    check-cast p1, LP/l;

    check-cast p2, LD/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    const p1, -0x5af0b3b9

    invoke-virtual {p2, p1}, LD/n;->N(I)V

    invoke-virtual {p2}, LD/n;->H()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, LD/l;->a:LD/U;

    if-ne p1, p3, :cond_0

    new-instance p1, Ls/g;

    invoke-direct {p1}, Ls/g;-><init>()V

    invoke-virtual {p2, p1}, LD/n;->V(Ljava/lang/Object;)V

    :cond_0
    move-object v1, p1

    check-cast v1, Ls/g;

    iget-object p1, p0, Landroidx/compose/foundation/b;->e:Lq/C;

    invoke-static {v1, p1}, Landroidx/compose/foundation/c;->a(Ls/g;Lq/C;)LP/l;

    move-result-object p1

    new-instance p3, Landroidx/compose/foundation/ClickableElement;

    iget-object v6, p0, Landroidx/compose/foundation/b;->i:LA0/c;

    const/4 v2, 0x0

    iget-boolean v3, p0, Landroidx/compose/foundation/b;->f:Z

    iget-object v4, p0, Landroidx/compose/foundation/b;->g:Ljava/lang/String;

    iget-object v5, p0, Landroidx/compose/foundation/b;->h:Lt0/e;

    move-object v0, p3

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/ClickableElement;-><init>(Ls/g;Lq/H;ZLjava/lang/String;Lt0/e;LA0/c;)V

    invoke-interface {p1, p3}, LP/l;->c(LP/l;)LP/l;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, LD/n;->q(Z)V

    return-object p1
.end method
