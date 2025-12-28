.class public final Landroidx/compose/ui/semantics/EmptySemanticsElement;
.super Ln0/P;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln0/P;"
    }
.end annotation


# instance fields
.field public final a:Lt0/c;


# direct methods
.method public constructor <init>(Lt0/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/semantics/EmptySemanticsElement;->a:Lt0/c;

    return-void
.end method


# virtual methods
.method public final d()LP/k;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/semantics/EmptySemanticsElement;->a:Lt0/c;

    return-object v0
.end method

.method public final bridge synthetic e(LP/k;)V
    .locals 0

    check-cast p1, Lt0/c;

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

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
