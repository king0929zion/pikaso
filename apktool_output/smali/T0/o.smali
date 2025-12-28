.class public abstract Lt0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lt0/q;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lt0/q;

    sget-object v1, Lt0/m;->m:Lt0/m;

    const-string v2, "TestTagsAsResourceId"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lt0/q;-><init>(Ljava/lang/String;ZLo2/e;)V

    sput-object v0, Lt0/o;->a:Lt0/q;

    return-void
.end method
