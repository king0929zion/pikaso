.class public final LW/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LW/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LW/c;

    invoke-direct {v0}, LW/c;-><init>()V

    iput-object v0, p0, LW/p;->a:LW/c;

    return-void
.end method


# virtual methods
.method public final a()LW/c;
    .locals 1

    iget-object v0, p0, LW/p;->a:LW/c;

    return-object v0
.end method
