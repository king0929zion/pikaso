.class public final Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$2;
.super Ln0/P;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln0/P;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroidx/compose/ui/focus/a;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/focus/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$2;->a:Landroidx/compose/ui/focus/a;

    return-void
.end method


# virtual methods
.method public final d()LP/k;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$2;->a:Landroidx/compose/ui/focus/a;

    iget-object v0, v0, Landroidx/compose/ui/focus/a;->d:LU/q;

    return-object v0
.end method

.method public final bridge synthetic e(LP/k;)V
    .locals 0

    check-cast p1, LU/q;

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$2;->a:Landroidx/compose/ui/focus/a;

    iget-object v0, v0, Landroidx/compose/ui/focus/a;->d:LU/q;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
